package com.company;


public class Point {
    private String nom;
    private int abscisse;
    private int ordonnee;

    public String getNom() {
        return nom;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    /**
     * @param name
     * @param abs
     * @param ord
     */
    public Point(String name, int abs, int ord) {
        this.setNom(name);
        this.setAbscisse(abs);
        this.setOrdonnee(ord);
    }

    public Point() {
        this("", 0, 0);
    }

    public String toString() {
        return ("Le point a pour x : " + this.getAbscisse() + " et pour y : " + this.getOrdonnee());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        return this.getAbscisse() == ((Point) obj).getAbscisse() && this.getOrdonnee() == ((Point) obj).getOrdonnee();
    }

    public double distance(Point pointA) {
        return Math.sqrt(Math.pow(this.getAbscisse(),2) - Math.pow( pointA.getAbscisse(),2) + Math.pow(this.getOrdonnee(),2) - Math.pow(pointA.getOrdonnee(),2));
    }

    public void transaltion(int x, int y) {
        this.setAbscisse(this.getAbscisse() + x);
        this.setOrdonnee(this.getOrdonnee() + y);
    }
}
