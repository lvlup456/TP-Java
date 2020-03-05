package BalClass;


public class Courier{

    private String addresse;
    private double poid;
    private Boolean express;

    public String getAddresse() {
        return addresse;
    }

    public double getPoid() {
        return poid;
    }

    public Boolean getExpress() {
        return express;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public void setExpress(Boolean express) {
        this.express = express;
    }

    public Courier(String addresse, double poid, Boolean express) {
        this.addresse = addresse;
        this.poid = poid;
        this.express = express;
    }
    public Courier(String addresse, double poid) {
        this.addresse = addresse;
        this.poid = poid;
        this.express = false;
    }

    public double calculePrix() {
        return 0;
    }

    public Boolean estValide() {
        return null;
    }

    @Override
    public String toString() {
        return  "addresse='" + addresse + '\'' +
                ", poid=" + poid +
                ", express=" + express;
    }
}
