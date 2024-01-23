package Constructor;

public class Main {
    public static void main(String[] args) {

        Childclass childObject1 = new Childclass(5, 10);
        System.out.println("Parent Variable: " + childObject1.var1);
        System.out.println("Child Variable: " + childObject1.c1);

        Childclass childObject2 = new Childclass(15);
        System.out.println("Parent Variable: " + childObject2.var1);
        System.out.println("Child Variable: " + childObject2.c1);
    }
}