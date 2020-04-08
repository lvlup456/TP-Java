package test.company;

public class Cercle extends Shape {

    private double rayon;

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public Cercle(double rayon) {
        this.setRayon(rayon);
    }

    @Override
    public double area() {
        return 2*Math.PI*Math.pow(getRayon(),2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }

    @Override
    public boolean isBigger(Shape obj) {
        return false;
    }
}
