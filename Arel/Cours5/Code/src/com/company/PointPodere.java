package com.company;

public class PointPodere extends Point {

    private double poid;

    public PointPodere(int abs, int ord, String nom, double poid){
        super(nom,abs,ord);
        this.setPoid(poid);
    }

    public PointPodere(int abs, int ord, double poid){
        super(abs,ord);
        this.setPoid(poid);
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public double getPoid() {
        return poid;
    }

    @Override
    public String toString() {
        if (this.getNom() != null){
            return ("le point podere " + getNom() + " est en " + getAbscisse() + "," + getOrdonnee() + " et un poid de: " + getPoid());
        }else{
            return ("le point podere est en " + getAbscisse() + "," + getOrdonnee() + " et un poid de: " + getPoid());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof PointPodere)) {
            return false;
        }
        return (this.getAbscisse() == ((PointPodere) obj).getAbscisse()) && (this.getOrdonnee() == ((PointPodere) obj).getOrdonnee()) && (this.getPoid() == ((PointPodere) obj).getPoid());
    }

    public PointPodere barycentre(Object [] tabObj){
        double x = this.getAbscisse() * this.getPoid();
        double y = this.getOrdonnee() * this.getPoid();
        double sommePoids = this.getPoid();
        for (Object obj:tabObj){
            if (obj instanceof PointPodere){
                x += ((PointPodere) obj).getAbscisse() * ((PointPodere) obj).getPoid();
                y += ((PointPodere) obj).getOrdonnee() * ((PointPodere) obj).getPoid();

                sommePoids += ((PointPodere) obj).getPoid();
            }else if (obj instanceof Point) {
                x += ((Point) obj).getAbscisse();
                y += ((Point) obj).getOrdonnee();

                sommePoids += 1;
            }
        }
        x /= sommePoids;
        y /= sommePoids;
        return new PointPodere((int)x,(int)y,"newPoint",1);
    }
}
