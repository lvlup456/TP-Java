package com.company;

public class Main {

    public static void main(String[] args) {
        Vector v = new Vector(2);
        Rational a = new Rational(2,3);

        v.set(0,a);
        System.out.println(v);

        Rational b = new Rational(2,3);
        a = v.get(0);
        a.mult(b);

        System.out.println(v);

        Vector v2 = new Vector(2);
        v2.set(0,b);
        v2.set(1,a);

        v.mult(a);
        System.out.println(v);

        v.add(v2);
        System.out.println(v);

    }
}
