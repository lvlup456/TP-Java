package com.company;

class Main {
    public static void main(String[] args) throws SuiteException {

        System.out.println("Hello Codiva");

        try{
            System.out.println(calcul(10,1,100));
        } catch(SuiteException e){
            System.err.println("[ERREUR]" + e);
        }
    }

    public static int calcul (int n, int un,int u0) throws SuiteException {
        try {
            if (n > 1){
                if (n % 2 == 0){
                    un = (calcul(n-1,un,u0)/calcul(n-2,un,u0)) - (calcul(n-2,un,u0)/calcul(n-1,un,u0));

                }else{
                    un = (calcul(n-2,un,u0)/calcul(n-1,un,u0)) - (calcul(n-1,un,u0)/calcul(n-2,un,u0));

                }
            }
        }catch(ArithmeticException e){
            throw new SuiteException( "dans suite(" + n + " " + un + " " + u0 + ")");
        }catch(SuiteException e){
            e.addTrace("qui est call par(" + n + " " + un + " " + u0 + ")");
            throw e;
        }
        if (n == 0){
            un = u0;
        }
        return un;
    }
}
