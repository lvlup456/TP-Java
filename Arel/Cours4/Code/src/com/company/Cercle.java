package com.company;

public class Cercle {
    private Point centre;
    private int rayon;
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public String getNom() {
        return nom;
    }

    public int getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public Cercle(int rayon,String nom,Point p){
        this.setCentre(p);
        this.setNom(nom);
        this.setRayon(rayon);
    }

    public void translater(int x, int y){
        this.centre.transaltion(x,y);
    }

    public double perimetre(){
        return 2 * Math.PI * this.rayon;
    }

    public double surface(){
        return Math.pow(2,this.rayon) * Math.PI;
    }

    public boolean estDansCercle(Point p){
        return ( this.centre.distance(p) <= this.rayon );
    }

    public boolean estSurCercle(Point p){
        return ( this.centre.distance(p) == this.rayon );
    }

}
