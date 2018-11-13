package ir.mftvanak.library.bistAban;

public class CastingExample {

    public static void main(String[] args) {

        int a = 10;
        double b = a;
        System.out.print(b);

        /////////////////////

        double c = 30.0;
        int d = (int) c;
        System.out.print(d);

        ////////////////////

        //Cannot Cast
//        String s = "s";
//        int f = (int) s;


        //int to short
        int f = 1000000000;
        short g = (short) f;
        System.out.print(g);

        //converting string to int
        String s = "7";
        int n = Integer.parseInt(s);
        System.out.print(n);


        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();


        //
        ChildClass childClass1 = (ChildClass) parentClass;
        ParentClass parentClass1 = new ParentClass();

    }
}
