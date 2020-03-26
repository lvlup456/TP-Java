package com.company;

import java.util.Arrays;

public class Vector {
    private Rational[] tab;
    private int tailleTab;

    public Rational[] getTab() {
        return tab;
    }

    public void setTab(Rational[] tab) {
        this.tab = tab;
    }

    public int getTailleTab() {
        return tailleTab;
    }

    public void setTailleTab(int tailleTab) {
        this.tailleTab = tailleTab;
    }

    public Vector(int tailleTab) {
        this.tab = new Rational[tailleTab];
        for (int i = 0; i < tailleTab; i++){
            this.tab[i] = new Rational(0,1);
        }
        this.tailleTab = tailleTab;
    }

    @Override
    public String toString() {
        String retour = "(";
        for (Rational element : getTab()){
            retour += element.toString();
            retour += ", ";
        }
        retour += ")";
        return retour;
    }

    public void set(int i, Rational r){
        Rational[] tab = getTab();
        if (i < getTailleTab()){
            tab[i] = r;
        }
        setTab(tab);
    }

    public Rational get(int i){
        Rational[] tab = getTab();
        if (i < getTailleTab()){
            return tab[i];
        }
        return null;
    }

    public void mult(Rational r){
        Rational[] tab = getTab();
        for (Rational elem : tab){
            elem.mult(r);
        }
        setTab(tab);
    }

    public void add(Vector v){
        Rational[] tab = getTab();
        if (this.getTailleTab() == v.getTailleTab()){
            for (int i = 0; i < this.getTailleTab();i++){
                tab[i].add(v.get(i));
            }
            setTab(tab);
        }else{
            System.out.println("tailles differentes");
        }
        this.setTab(tab);
    }
}

