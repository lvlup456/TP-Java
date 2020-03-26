package com.company;

import Cypher.TranspoPaire;
import Cypher.Transposition;

public class Main {

    public static void main(String[] args) {
        Transposition test = new Transposition("test");
        test.Chiffrement();
        System.out.println(test);

        TranspoPaire test2 = new TranspoPaire("JAVACESTSUPER");
        test2.Chiffrement();
        System.out.println(test2);
    }
}
