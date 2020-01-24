package com.company;

public class Polygone {
    private Point[] sommets;
    private int nbSommets;
    private String nom;

    public String getNom() {
        return nom;
    }

    public int getNbSommets() {
        return nbSommets;
    }

    public Point[] getSommets() {
        return sommets;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbSommets(int nbSommets) {
        this.nbSommets = nbSommets;
    }

    public void setSommets(Point[] sommets) {
        this.sommets = sommets;
    }

    public Polygone(String nom, Point[] sommets){
        setNbSommets(sommets.length);
        setNom(nom);
        setSommets(sommets);
    }

    public void translater(int x, int y){
        Point[] liste = this.getSommets();
        for (int i = 0 ; i < this.getNbSommets() ; i++ ){
            liste[i].setOrdonnee(liste[i].getOrdonnee() + y);
            liste[i].setAbscisse(liste[i].getAbscisse() + x);
        }
        this.setSommets(liste);
    }

    public double perimetre(){
        Point[] liste = this.getSommets();
        double peri = 0;
        for (int i = 0 ; i < this.getNbSommets() ; i++){
            peri += liste[i].distance(liste[(i+1)%(this.getNbSommets()-1)]);
        }
        return peri;
    }

    //pas fini
    public double surface(){
        return 0;
    }
}
