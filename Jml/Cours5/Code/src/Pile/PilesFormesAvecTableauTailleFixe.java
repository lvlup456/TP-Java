package Pile;

import com.company.Forme;

import java.text.Normalizer;
import java.util.Arrays;

public class PilesFormesAvecTableauTailleFixe implements PileForme{

    Forme[] laPile;

    public Forme[] getLaPile() {
        return laPile;
    }

    public void setLaPile(Forme[] laPile) {
        this.laPile = laPile;
    }

    public PilesFormesAvecTableauTailleFixe() {
        laPile = new Forme[0];
    }

    public PilesFormesAvecTableauTailleFixe(Forme[] laPile){
        this.laPile = laPile;
    }

    @Override
    public PilesFormesAvecTableauTailleFixe creer() {
        return new PilesFormesAvecTableauTailleFixe();
    }

    @Override
    public PileForme empiler(PileForme laPileForme, Forme laForme) {
        Forme[] Pille = ((PilesFormesAvecTableauTailleFixe) laPileForme).getLaPile();
        Forme[] newPille = new Forme[Pille.length + 1];
        for (int i = 0; i < Pille.length; i++)
            newPille[i] = Pille[i];
        newPille[Pille.length] = laForme;
        return ((PileForme) new PilesFormesAvecTableauTailleFixe(newPille));
    }

    @Override
    public PileForme depiler(PileForme laPileForme) {
        Forme[] Pille = ((PilesFormesAvecTableauTailleFixe) laPileForme).getLaPile();
        Forme[] newPille = new Forme[Pille.length - 1];

        for (int i = 0; i < newPille.length; i++)
            newPille[i] = Pille[i];
        return ((PileForme) new PilesFormesAvecTableauTailleFixe(newPille));
    }

    @Override
    public Forme sommet(PileForme laPileForme) {
        Forme[] Pille = ((PilesFormesAvecTableauTailleFixe) laPileForme).getLaPile();
        return Pille[Pille.length - 1];
    }

    @Override
    public Boolean vide(PileForme laPileForme) {
        Forme[] Pille = ((PilesFormesAvecTableauTailleFixe) laPileForme).getLaPile();
        return (Pille.length == 0);
    }

    @Override
    public String toString() {
        return "PilesFormesAvecTableauTailleFixe{" +
                "laPile=" + Arrays.toString(laPile) +
                '}';
    }
}
