package Point;

import java.awt.geom.Point2D;
import java.util.Objects;

public class Point1D {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Point1D(int x) {
        this.setX(x);
    }

    @Override
    public String toString() {
        return "Point1D{" +
                "x=" + x +
                '}';
    }

    public boolean equals(Object o) {
        if (o instanceof Point1D){
            Point1D point1D = (Point1D) o;
            return this.getX() == point1D.getX();
        }else{
            return false;
        }
    }

    public void afficheEgaux(Object[] tab){
        for (Object x : tab){
            if (this.equals(x)){
                System.out.println(x);
            }
        }
    }
}
