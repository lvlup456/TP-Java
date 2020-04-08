package Pile;

import test.company.Shape;

public abstract class PileForme {
    public abstract PileForme creer();
    public abstract void empiler(Shape laForme);
    public abstract void depiler();
    public abstract Shape sommet();
    public abstract Boolean vide();
}
