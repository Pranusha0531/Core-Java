package Constructor;

public class Childclass extends Parentclass {

    public int c1;

    public Childclass(int var1, int c1) {
        super(var1);
        this.c1 = c1;
    }

    public Childclass(int c1) {
        super(100);
        this.c1 = c1;

    }
}