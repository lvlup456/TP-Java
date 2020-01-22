package com.company;

/**
 * @author Thomas Durand
 * @version 1.0
 */
public class Main {
    /**
     * test des operateurs booleans
     */
    private static void testMath(){
        int x = 3;
        int y = 3;
        int z = 3;

        System.out.println("x vaut " + x);
        System.out.println("y vaut " + y);
        System.out.println("z vaut " + z);

        if (x > 3 && y > 3){
            System.out.println("oui ils sont tout les 2 sup a 3");
        }else{
            System.out.println("non ils ne sont tout les 2 sup a 3");
        }

        if (x == y && y == z){
            System.out.println("oui ils sont tout les 3 egaux");
        }else{
            System.out.println("non ils ne sont tout les 3 egaux");
        }

        if (x > y && x <= z){
            System.out.println("oui x compris entre y et z ");
        }else{
            System.out.println("non il n'est pas compris entre y et z");
        }

        if ( x == y || y ==z || z == x ){
            System.out.println("oui 2 val au moins sont egales");
        }else{
            System.out.println("non 2 val au moins ne sont pas egales");
        }

        if ( (x == y && y != z) || (y ==z && z != x) || (z == x && x != y) ){
            System.out.println("oui 2 val au plus sont egales");
        }else{
            System.out.println("non 2 val au plus ne sont pas egales");
        }
    }

    /**
     * renvoie la string du jour correspondant a un integer
     * @param nbr
     * @return
     */
    private static String jourDeLaSemaine(int nbr){
        String retour;
        switch (nbr){
            case 0:
                retour =  "Dimanche";
            break;
            case 1:
                retour = "Lundi";
            break;
            case 2:
                retour =  "Mardi";
            break;
            case 3:
                retour = "Mercredi";
            break;
            case 4:
                retour = "Jeudi";
            break;
            case 5:
                retour = "Vendredi";
                break;
            case 6:
                retour = "Samedi";
                break;
            default:
                retour = "veillez rentrer un nbr entre 0 et 6";
                break;
        }
        return retour;
    }

    /**
     * formule de zeller qui renvoie le numero du jour pour une date donnee
     * @param jour
     * @param mois
     * @param annee
     * @return retourne un nombre entre 0 et 6 qui correspond a un jour de la semaine
     */
    private static int zeller(int jour, int mois, int annee){


        String temp = Integer.toString(annee);
        String tempaa = temp.substring(temp.length()-2, temp.length());
        int aa = Integer.parseInt(tempaa);


        String tempss = temp.substring(0, temp.length()-2);
        int ss = Integer.parseInt(tempss);

        int mm ;
        if (mois <= 2){
            mm = mois + 10;
            if (aa != 0){
                aa--;
            }else{
                ss--;
                aa = 99;
            }
        }else {
            mm = mois - 2;
        }
        return ((((13 * mm - 1) / 5) + jour + aa + aa/4 + ss/4 - 2 * ss)) % 7;

    }

    /**
     * @param n nombre d'iterations
     * @return valeur de pi
     */
    private static double formuleMachin(int n){
        double tmp1 = -4*5;
        double tmp2 = -239;

        double pi = 0;

        for (int i = 0; i < n; i++){
            tmp1 = tmp1 / (-1*(5*5));
            tmp2 = tmp2 / (-1*(239*239));
            pi += (tmp1-tmp2)/(2*i+1);
        }
        return pi*4;
    }

    /**
     * fonction main pour POC
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Coucou tout le monde");
        testMath();

        for (int i = 1; i <= 7 ;i++){
            System.out.println(jourDeLaSemaine(i % 7));
        }

        System.out.println(jourDeLaSemaine(zeller(8,4,1998)));
        System.out.println(jourDeLaSemaine(zeller(1,1,2000)));
        System.out.println(jourDeLaSemaine(zeller(18,06,1999)));

        System.out.println("valeur de pi = " + formuleMachin(100000));

    }
}
