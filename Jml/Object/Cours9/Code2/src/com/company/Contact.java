package com.company;

import java.util.HashSet;
import java.util.Set;

public class Contact {

    private HashSet<NumeroTelephone> listeTel = new HashSet<>();
    private String nom;

    public Contact(Set<NumeroTelephone> listeTel, String nom) {
        for (NumeroTelephone num : listeTel){
            this.listeTel.add(num);
        }
        this.nom = nom;
    }

    public HashSet<NumeroTelephone> getListeTel() {
        return listeTel;
    }

    public void setListeTel(HashSet<NumeroTelephone> listeTel) {
        this.listeTel = listeTel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        String retour =  "le contact" + nom ;
        for (NumeroTelephone num : listeTel){
            retour += num.toString();
        }
        return retour;
    }


}
