package com.company;

public class Main {

    public static void main(String[] args) {
	    point point1 = new point("p1",2,2);
        point point2 = new point("p2",2,2);

        System.out.println(point1);

        System.out.println("la distance entre p1 et p2 est : " + point1.distance(point2));

    }
}
