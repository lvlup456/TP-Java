package polynome;

import java.lang.reflect.Array;
import java.util.Arrays;


public class PolynomeBis {

    private Monome[] nombres;

    public PolynomeBis(Monome[] nombres){
        this.setNombres(nombres);
    }

    public Monome[] getNombres() {
        return nombres;
    }

    public void setNombres(Monome[] nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        Monome[] nombres = getNombres();
        String out = " ";
        out += nombres[0].toString();
        for (int i = 1; i < nombres.length; i++){
            out += " ";
            out += nombres[i].toString();
        }
        return out;
    }

    public double eval(double x){
        double res = 0;
        Monome[] nombres = getNombres();
        for (int i = 0; i < nombres.length; i++){
            res += nombres[i].getCoef() * Math.pow(x,nombres[i].getExposant());
        }
        return res;
    }

    public PolynomeBis derive(){
        Monome[] nombres = Arrays.copyOfRange(getNombres(),1,getNombres().length);
        for(int i=0; i < nombres.length; i++){
            nombres[i].setCoef(nombres[i].getCoef()*(nombres[i].getExposant()));
            nombres[i].setExposant(nombres[i].getExposant()-1);
        }
        return new PolynomeBis(nombres);
    }

    public int getDegre(){
        Monome[] nombres = getNombres();
        int max = nombres[0].getExposant();
        for(int i =1; i < nombres.length; i++){
            if (nombres[i].getExposant() >= max){
                max = nombres[i].getExposant();
            }
        }
        return max;
    }
}
