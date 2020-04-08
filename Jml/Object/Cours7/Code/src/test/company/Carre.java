package test.company;


public class Carre extends Shape {

    private int longueur;

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public Carre(int longueur) {
        this.setLongueur(longueur);
    }

    @Override
    public double area() {
        return this.getLongueur()*this.getLongueur();
    }

    @Override
    public String toString() {
        return "Carre{" +
                "longueur=" + longueur +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carre carre = (Carre) o;
        return longueur == carre.longueur;
    }

    @Override
    public boolean isBigger(Shape obj) {
        return false;
    }
}
