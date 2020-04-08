package BalClass;

import java.util.Arrays;

public class BoiteAuLettre {

    private Courier[] listeCourier;

    public Courier[] getListeCourier() {
        return listeCourier;
    }

    public void setListeCourier(Courier[] listeCourier) {
        this.listeCourier = listeCourier;
    }

    public BoiteAuLettre(Courier[] listeCourier) {
        this.listeCourier = listeCourier;
    }

    public double CalcPrixTotal(){
        Courier[] tab = getListeCourier();
        double res = 0;
        for (Courier element: tab){
            if (element.estValide()){
                res += element.calculePrix();
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String retour = "";
        Courier[] tab = getListeCourier();

        for (Courier element : tab){
            retour += element.toString();
            retour += "\n";
        }
        return retour;
    }
}
