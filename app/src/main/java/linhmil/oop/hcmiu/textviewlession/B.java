package linhmil.oop.hcmiu.textviewlession;

/**
 * Created by Admin on 11/30/2017.
 */

public class B extends A {
    public int color;

    public B(int x, int y, int z, int color) {
        super(x, y, z);
        this.color = color;
    }

    public B(A o, int color) {
        super(o);
        this.color = color;
    }
}
