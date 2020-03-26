package Pile;

import test.company.Shape;

import java.util.Arrays;

public class PilesFormesAvecTableauTailleFixe extends PileForme{

    Shape[] laPile;

    public Shape[] getLaPile() {
        return laPile;
    }

    public void setLaPile(Shape[] laPile) {
        this.laPile = laPile;
    }

    public PilesFormesAvecTableauTailleFixe() {
        laPile = new Shape[0];
    }

    public PilesFormesAvecTableauTailleFixe(Shape[] laPile){
        this.laPile = laPile;
    }

    @Override
    public PilesFormesAvecTableauTailleFixe creer() {
        return new PilesFormesAvecTableauTailleFixe();
    }

    @Override
    public void empiler(Shape laForme) {
        Shape[] Pille = getLaPile();
        Shape[] newPille = new Shape[Pille.length + 1];
        for (int i = 0; i < Pille.length; i++)
            newPille[i] = Pille[i];
        newPille[Pille.length] = laForme;
        this.setLaPile(newPille);
    }

    @Override
    public void depiler() {
        Shape[] Pille = getLaPile();
        Shape[] newPille = new Shape[Pille.length - 1];

        for (int i = 0; i < newPille.length; i++)
            newPille[i] = Pille[i];
        this.setLaPile(newPille);
    }

    @Override
    public Shape sommet() {
        Shape[] Pille = getLaPile();
        return Pille[Pille.length - 1];
    }

    @Override
    public Boolean vide() {
        Shape[] Pille = getLaPile();
        return (Pille.length == 0);
    }

    @Override
    public String toString() {
        return "laPile={" + Arrays.toString(laPile) +
                '}';
    }
}
