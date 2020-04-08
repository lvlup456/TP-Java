package polynome;

public class Polynome {
    private double[] coef;

    public double[] getCoef() {
        return coef;
    }

    public void setCoef(double[] coef) {
        this.coef = coef.clone();
    }

    public int getDegre(){
        return this.getCoef().length-1;
    }

    public double get(int i){
        if (i < getDegre()){
            return this.getCoef()[i];
        }else{
            return -1;
        }
    }

    public Polynome(double[] coef){
        this.setCoef(coef);
    }

    @Override
    public String toString() {
        double[] coef = getCoef();
        String retour = "";
        for (int i = 0; i < coef.length; i++){
            if (coef[i] != 0){
                retour = retour + " " + coef[i] + "^" + i;
            }
        }
        return retour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Polynome){
            double[] autreCoef = ((Polynome) obj).getCoef();
            double[] coef = getCoef();

            if (coef.length != autreCoef.length){
                return false;
            }
            for(int i =0;i < coef.length; i++){
                if (coef[i] != autreCoef[i]) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public double eval(double x){
        double res = 0;
        double[] coef = getCoef();
        for (int i = 0; i < coef.length; i++){
            res += coef[i] * Math.pow(x,i);
        }
        return res;
    }

    public Polynome derive(){
        double[] coef = getCoef();
        double[] newCoef = new double[coef.length - 1];

        for(int i=1; i < coef.length; i++){
            newCoef[i-1] = coef[i] * i;
        }
        return new Polynome(newCoef);
    }
}
