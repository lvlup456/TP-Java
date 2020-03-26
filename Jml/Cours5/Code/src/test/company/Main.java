package com.company;

import Pile.PileForme;
import Pile.PilesFormesAvecTableauTailleFixe;
import Pile.TestPileForme;

public class Main {

    public static void main(String[] args) {
	    Forme a = new Carre(8);
	    Forme b = new Cercle(2);
	    System.out.println(a + " et " +  b + " = " + TestForme.compare(a,b));

		PileForme pile = new PilesFormesAvecTableauTailleFixe();
		TestPileForme.testEmpile(pile,a);
    }
}
