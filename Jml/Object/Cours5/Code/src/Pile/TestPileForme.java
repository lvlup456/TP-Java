package Pile;

import com.company.Forme;

public class TestPileForme {
    public static void testEmpile(PileForme pile, Forme forme){
        pile = pile.empiler(pile,forme);
        pile = pile.empiler(pile,forme);

        System.out.println(((PilesFormesAvecTableauTailleFixe) pile));
    }
    public static void testDepiler(PileForme pile, Forme forme){

    }
}
