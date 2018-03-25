package linhmil.oop.hcmiu.textviewlession;

/**
 * Created by Admin on 11/30/2017.
 */

public class A {
    public int x;
    protected int y;
    private int z;

    public A(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public A( A o) {
        x= o.x;
        y= o.y;
        z= o.getZ();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
