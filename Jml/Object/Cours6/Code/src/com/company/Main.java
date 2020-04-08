package com.company;

import Point.Point1D;
import Point.Point2D;
import Point.Point3D;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	    //test
        Point1D p1 = new Point1D(8);
        Point2D p2 = new Point2D(8,6);
        Point2D p3 = new Point2D(8,6);
        Point3D p4 = new Point3D(8,6,5);
        Point3D p5 = new Point3D(8,12,5);

        Object tab[] = {p1,p2,p3,p4,p5};
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        p2.afficheEgaux(tab);

    }
}
