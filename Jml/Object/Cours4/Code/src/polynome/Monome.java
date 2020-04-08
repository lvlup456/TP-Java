package polynome;

public class Monome {

    private int exposant;
    private double coef;

    public int getExposant() {
        return exposant;
    }

    public double getCoef() {
        return coef;
    }

    public void setExposant(int exposant) {
        this.exposant = exposant;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public Monome(int exposant, double coef) {
        this.exposant = exposant;
        this.coef = coef;
    }

    @Override
    public String toString() {
        return  coef + "^" + exposant;
    }
}
