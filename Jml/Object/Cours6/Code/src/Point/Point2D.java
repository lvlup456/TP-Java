package Point;

import java.util.Objects;

public class Point2D extends Point1D {

    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        super(x);
        this.setY(y);
    }

    public boolean equals(Object o) {
        if (o instanceof Point2D){
            if (!super.equals(o)) return false;
            Point2D point2D = (Point2D) o;
            return this.getY() == point2D.getY();
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + this.getX() +
                "y=" + this.getY() +
                '}';
    }
}
