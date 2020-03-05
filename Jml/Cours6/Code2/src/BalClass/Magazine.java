package BalClass;

public class Magazine extends Courier {

    public Magazine(String addresse, double poid, Boolean express) {
        super(addresse, poid, express);
    }

    public Magazine(String addresse, double poid) {
        super(addresse, poid);
    }

    @Override
    public double calculePrix() {
        double prix = 5 * getPoid();
        if (this.getExpress()){
            prix = prix*2;
        }
        return prix;
    }

    @Override
    public Boolean estValide() {
        return (this.getAddresse() != "");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                super.toString() +
                "}";
    }
}
