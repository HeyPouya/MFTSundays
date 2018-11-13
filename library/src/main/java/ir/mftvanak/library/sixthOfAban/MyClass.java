package ir.mftvanak.library.sixthOfAban;

public class MyClass {


    //     /      slash
    //     \      back slash
    //     #     sharp
    //      -     dash | hyphen
    //     []    bracket | brace
    //     {}    curly brace
    //     ()    prantez
    //     '     single quotation
    //     "     double qoutation
    //     ;     semi colon
    //     &     ampersand


    static String name = "Pouya";
    String family = "Heydari";
    int age = 50;
    double height = 182.9;
    static boolean isAlive = true;


    public static void main(String[] args) {
//        printHello();

        String teacherName = getName();
        System.out.print(teacherName);
    }

    // this function prints hello
    static void printHello() {
        System.out.print("Hello");
    }


    static String getName() {
        return name;
    }

    static boolean getAliveness() {
        return isAlive;
    }
}
