package com.company;

public class TestPoint {
    /**
     * fonction de test pour la classe point
     */
    public static void main() {
        Point p1 = new Point("p1", 2, 2);
        Point p2 = new Point("p2", 1, 4);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("la distance : " + p2.distance(p1));

        p1.transaltion(-1, 2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
