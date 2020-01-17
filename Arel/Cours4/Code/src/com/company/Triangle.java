package com.company;

public class Triangle {
    Point [] sommets;
    String nom;

    public void setSommets(Point[] sommets) {
        this.sommets = sommets;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Point[] getSommets() {
        return sommets;
    }

    public String getNom() {
        return nom;
    }

    public Triangle(Point [] sommets, String nom){
        setNom(nom);
        setSommets(sommets);
    }

    public void translater(int x, int y){
        Point [] list = this.getSommets();
        for (int i = 0 ; i < 3 ; i++){
            list[i].setOrdonnee(list[i].getOrdonnee() + y);
            list[i].setAbscisse(list[i].getAbscisse() + x);
        }
        this.setSommets(list);
    }

    public double perimetre(){
        Point[] liste = this.getSommets();
        double peri = 0;
        for (int i = 0 ; i < 3 ; i++){
            peri += liste[i].distance(liste[(i+1)%2]);
        }
        return peri;
    }

    public double surface(){
        Point [] liste = getSommets();
        double s = this.perimetre()/2;
        return Math.sqrt( s * ( s - liste[0].distance(liste[1])) * ( s - liste[1].distance(liste[2])) * ( s - liste[2].distance(liste[0]) ) ) ;
    }
}
