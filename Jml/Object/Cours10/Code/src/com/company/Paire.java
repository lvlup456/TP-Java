package com.company;

class Paire<X extends Comparable<X>,Y extends Comparable<Y>> implements Comparable<Paire<X,Y>> {

    private X x;
    private Y y;

    Paire(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX(){
        return this.x;
    }
    public Y getY(){
        return this.y;
    }

    public String toString(){
        return "le couple(" + this.x + ", " + this.y + ")";
    }


    public boolean equals(Object obj){
        if (obj instanceof Paire<?,?>){
            return ((Paire<?,?>) obj).getX().equals(getX()) && ((Paire<?,?>) obj).getY().equals(getY());
        }
        return false;
    }

    public Paire<X,Y> clone(){
        return new Paire<X,Y>(this.getX(),this.getY());
    }

    public static <E extends Comparable<E> > E compare( Paire<E,E> paire ){
        if ( paire.getX().compareTo(paire.getY()) >=0 ){
            return paire.getX();
        }else{
            return paire.getY();
        }
    }

    public int compareTo(Paire<X,Y> p){
        if (this.equals(p)){
            return 0;
        }else if(this.getX().compareTo(p.getX()) > 1 || (this.getX().compareTo(p.getX()) == 0 && this.getY().compareTo(p.getY()) > 1 ) ){
            return 1;
        }else{
            return -1;
        }
    }

    public static <Z extends Number & Comparable<Z>, T extends Number & Comparable<T>> double sum(Paire<Z, T> p) {
        return p.getX().doubleValue() + p.getY().doubleValue();
    }



}
