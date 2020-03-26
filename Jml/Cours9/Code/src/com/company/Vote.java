package com.company;



class Vote {
    private String nom;

    public static final Vote blanc = new Vote("blanc");
    public static final Vote nul = new Vote("nul");
    public static final Vote oui = new Vote("oui");
    public static final Vote non = new Vote("non");

    public String getNom(){
        return this.nom;
    }

    public Vote(String nom){
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "nom = " + this.getNom();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Vote &&
                ((Vote) o).getNom().toUpperCase().equals(this.getNom().toUpperCase());
    }


    public int hashCode(){
        return getNom().toUpperCase().hashCode();
    }

}

