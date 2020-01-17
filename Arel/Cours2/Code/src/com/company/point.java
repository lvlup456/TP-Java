package com.company;

public class point {
    private String nom;
    private int abs;
    private int ord;

    //getter
    public String getNom(){
        return this.nom;
    }
    public int getAbs(){
        return this.abs;
    }
    public int getOrd(){
        return this.ord;
    }

    //setter
    public void setAbs(int abs) {
        this.abs = abs;
    }
    public void setOrd(int ord) {
        this.ord = ord;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    //constructor
    public point(String nom, int abs, int ord){
        System.out.println("initialisation d'un point");
        this.nom = nom;
        this.abs = abs;
        this.ord = ord;
    }

    public double distance(point p){
        return Math.sqrt(Math.pow(2, this.getAbs()) - Math.pow(2, p.getAbs()) + Math.pow(2, this.getOrd()) - Math.pow(2, p.getOrd()));
    }

    public void transaltion(vecteur v){
        this.setAbs(this.getAbs() + v.getX());
        this.setOrd(this.getOrd() + v.getY());
    }

    public String toString(){
        return ("Le point: "+ this.getNom() + " a pour x : " + this.getAbs() + " et pour y : " + this.getOrd()) ;
    }
}
