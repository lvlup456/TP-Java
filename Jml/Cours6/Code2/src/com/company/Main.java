package com.company;

import BalClass.*;

public class Main {

    public static void main(String[] args) {

        Lettre lettre = new Lettre("Paris",16,true, FormatLettre.A3);
        Magazine magazine = new Magazine("Paris",0.5,false);
        Coli coli = new Coli("Paris",16,true,12);

        Courier[] couriers = {lettre,magazine,coli};

        BoiteAuLettre BAL = new BoiteAuLettre(couriers);

        System.out.println(BAL.CalcPrixTotal());
        System.out.println(BAL);

    }
}
