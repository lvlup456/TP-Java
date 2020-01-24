package com.company;

public class Main {

    public static void main(String[] args) {
        Point point = new Point("test",1,2);

        PointPodere a = new PointPodere(8,8,"a",44);
        PointPodere b = new PointPodere(8,8,"b",44);

        if (a.equals(b)){
            System.out.println("oui ca marche");
        }else{
            System.out.println("ya probleme");
        }

        // test exercice
        /*
        Point pointA, pointB;
        pointA = new Point("A", 0, 0);
        pointB = pointA;
        System.out.println("pointA -> " + pointA + " / pointB -> " +
                pointB);
        System.out.println("pointA == pointB -> " + (pointA == pointB));
        System.out.println("pointA.equals(pointB) -> "
                + (pointA.equals(pointB)));
        pointB = new Point("A", 0, 0); // même test
        */

        //Test Td 2
        Point pointA, pointB;
        PointPodere pointPondereA, pointPondereB;
        pointA = new PointPodere(0, 0, 0);
        pointPondereA = new PointPodere(0,0,"a",1.5);
        System.out.println(pointA);
        System.out.println((PointPodere) pointA);
        System.out.println(pointPondereA);
        System.out.println((Point) pointPondereA);
        //System.out.println("Poids de A : " + ((PointPodere) pointA).getPoid());
        System.out.println("Poids de A : " + pointPondereA.getPoid());
        pointPondereB = new PointPodere(1, 2, "B", 1.5);
        pointB = pointPondereB;
        System.out.println(pointB);
        System.out.println((PointPodere) pointB);
        System.out.println(pointPondereB);
        System.out.println((Point) pointPondereB);
        //System.out.println("Poids de B : " + ((PointPodere) pointB).getPoid());
        System.out.println("Poids de B : " + pointPondereB.getPoid());

        PointPodere testa = new PointPodere(10,30,1);
        Point testb= new Point(20,50);
        Object [] tabObj = {testb};
        System.out.println(testa.barycentre(tabObj));
    }



}
