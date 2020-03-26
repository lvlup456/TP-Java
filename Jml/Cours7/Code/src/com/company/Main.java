package com.company;

import Pile.PileForme;
import Pile.PilesFormesAvecTableauTailleFixe;
import test.company.Carre;

public class Main {

    public static void main(String[] args) {

        PilesFormesAvecTableauTailleFixe test = new PilesFormesAvecTableauTailleFixe();

        Carre c = new Carre(8);

        test.empiler(c);
        test.empiler(c);

        System.out.println(test);
        test.depiler();
        System.out.println(test);

    }
}
