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
     *
     * @param name 
     * @param abs
     * @param ord
     */
    public Point(String name, int abs,int ord){
        this.setNom(name);
        this.setAbscisse(abs);
        this.setOrdonnee(ord);
    }

    public String toString(){
        return ("Le point: "+ this.getNom() + " a pour x : " + this.getAbscisse() + " et pour y : " + this.getOrdonnee()) ;
    }
}
