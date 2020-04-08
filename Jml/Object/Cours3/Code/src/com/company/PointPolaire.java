package com.company;

public class PointPolaire {
    private double angle;
    private double dist;


    public double getAngle() {
        return angle;
    }

    public double getDist() {
        return dist;
    }

    public void setAngle(double x,double y) {
        this.angle = Math.atan2(x,y);
    }

    public void setDist(double x,double y) {
        this.dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double getOrdonnee() {
        return Math.sin(this.getAngle()) * getDist();
    }

    public double getAbscisse() {
        return Math.cos(this.getAngle()) * getDist();
    }


    public PointPolaire(int x, int y) {
        this.setAngle(x,y);
        this.setDist(x,y);
    }

    public PointPolaire() {
        this(0, 0);
    }

    public String toString() {
        return ("Le point a pour angle : " + this.getAngle() + " et pour dist : " + this.getDist());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PointPolaire)) {
            return false;
        }
        return this.getAngle() == ((PointPolaire) obj).getAngle() && this.getDist() == ((PointPolaire) obj).getDist();
    }

    public double distance(PointPolaire pointA) {
        return Math.sqrt(Math.pow(this.getAbscisse(),2) - Math.pow( pointA.getAbscisse(),2) + Math.pow(this.getOrdonnee(),2) - Math.pow(pointA.getOrdonnee(),2));
    }

    public void transaltion(double x, double y) {
        this.setDist(this.getOrdonnee() + x,this.getAbscisse() + y);
        this.setAngle(this.getOrdonnee() + x,this.getAbscisse() + y);
    }

    public void rotation(double angle){
        this.angle = this.getAngle() + angle;
    }

}
