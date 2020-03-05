package BalClass;

public class Lettre extends Courier {

    private FormatLettre format;

    public FormatLettre getFormat() {
        return format;
    }

    public void setFormat(FormatLettre format) {
        this.format = format;
    }

    public Lettre(String addresse, double poid, Boolean express, FormatLettre format) {
        super(addresse, poid, express);
        this.format = format;
    }

    public Lettre(String addresse, double poid, FormatLettre format) {
        super(addresse, poid);
        this.format = format;
    }

    @Override
    public double calculePrix() {
        double prix;

        if (this.getFormat() == FormatLettre.A4){
            prix = 2.5 +this.getPoid();
        }else{
            prix = 3.5+this.getPoid();
        }
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
        return "Lettre{" +
                super.toString() + ", "+
                "format=" + format +
                '}';
    }
}
