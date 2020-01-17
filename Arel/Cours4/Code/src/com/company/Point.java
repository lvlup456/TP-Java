package com.company;

public class Point {

    private String nom;
    private int abscisse;
    private int ordonnee;

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public Point(String name, int abs,int ord){
        this.setNom(name);
        this.setAbscisse(abs);
        this.setOrdonnee(ord);
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(2, this.getAbscisse()) - Math.pow(2, p.getAbscisse()) + Math.pow(2, this.getOrdonnee()) - Math.pow(2, p.getOrdonnee()));
    }

    public void transaltion(int x,int y){
        this.setAbscisse(this.getAbscisse() + x);
        this.setOrdonnee(this.getOrdonnee() + y);
    }

    public String toString(){
        return ("Le point: "+ this.getNom() + " a pour x : " + this.getAbscisse() + " et pour y : " + this.getOrdonnee()) ;
    }
}
