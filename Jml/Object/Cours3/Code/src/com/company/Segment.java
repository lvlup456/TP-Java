package com.company;

public class Segment {
    private Point pointA;
    private Point pointB;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Segment(Point pointA, Point pointB){
        this.setPointA(pointA);
        this.setPointB(pointB);
    }

    /**
    public Segment(Segment seg){
        this.setPointA(seg.getPointA());
        this.setPointB(seg.getPointB());
    }
    */
    public Segment(Segment seg){
        this.setPointA(new Point("",seg.getPointA().getAbscisse(), seg.getPointA().getOrdonnee()));
        this.setPointB(new Point("",seg.getPointB().getAbscisse(), seg.getPointB().getOrdonnee()));

    }

    @Override
    public String toString() {
        return "le segment commence en " + getPointA() + " et finis en " + getPointB();
    }
}

