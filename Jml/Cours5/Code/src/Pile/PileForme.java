package Pile;

import com.company.Forme;

public interface PileForme {
    PileForme creer();
    PileForme empiler(PileForme laPileForme, Forme laForme);
    PileForme depiler(PileForme laPileForme);
    Forme sommet(PileForme laPileForme);
    Boolean vide(PileForme laPileForme);
}
