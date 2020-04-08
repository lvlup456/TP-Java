package BalClass;

public class Coli extends Courier {

    private double volume;

    public double getvolume() {
        return volume;
    }

    public void setvolume(double volume) {
        this.volume = volume;
    }

    public Coli(String addresse, double poid, Boolean express, double volume) {
        super(addresse, poid, express);
        this.volume = volume;
    }

    public Coli(String addresse, double poid, double volume) {
        super(addresse, poid);
        this.volume = volume;
    }

    @Override
    public double calculePrix() {
        double prix = 0.25*getvolume() + getPoid();
        if (this.getExpress()){
            prix = prix *2;
        }
        return prix;
    }

    @Override
    public Boolean estValide() {
        return (this.getAddresse() != "") && (this.getvolume() <= 50);
    }

    @Override
    public String toString() {
        return "Coli{" +
                super.toString() + ", "+
                "volume=" + volume +
                '}';
    }
}
