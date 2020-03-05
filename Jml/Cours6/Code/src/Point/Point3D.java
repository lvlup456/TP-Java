package Point;

import java.util.Objects;

public class Point3D extends Point2D{

    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.setZ(z);
    }

    public boolean equals(Object o) {
        if (o instanceof Point3D){
            if (!super.equals(o)) return false;
            Point3D point3D = (Point3D) o;
            return this.getZ() == point3D.getZ();
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.getX() +
                "y=" + this.getY() +
                "z=" + this.getZ() +
                '}';
    }
}