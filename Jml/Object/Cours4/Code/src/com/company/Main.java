package com.company;

import polynome.Monome;
import polynome.Polynome;
import polynome.PolynomeBis;

public class Main {

    public static void main(String[] args) {

        double[] coefs = {4, 5, 6, 7, 8, 9};

        Polynome test = new Polynome(coefs);



        Monome c1 = new Monome(0,4);
        Monome c2 = new Monome(1,5);
        Monome c3 = new Monome(2,6);
        Monome c4 = new Monome(3,7);
        Monome c5 = new Monome(4,8);
        Monome c6 = new Monome(5,9);
        Monome[] nombres  = {c1,c2,c3,c4,c5,c6};
        PolynomeBis test2 = new PolynomeBis(nombres);

        System.out.println(test);
        System.out.println(test2);

        System.out.println(test2.eval(8));
        System.out.println(test.eval(8));

        System.out.println(test2.getDegre());
        System.out.println(test.getDegre());

        System.out.println(test2.derive());
        System.out.println(test.derive());



    }
}
