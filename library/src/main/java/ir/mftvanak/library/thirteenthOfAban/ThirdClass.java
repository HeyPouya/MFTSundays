package ir.mftvanak.library.thirteenthOfAban;

public class ThirdClass {


    public static void main(String[] args) {
        ParentClass.printName();

        ParentClass pClass = new ParentClass();

        // printMyName is public
        pClass.printMyName();
        //printYourName is private
//        pClass.printYourName();

        //printHisName is protected
        pClass.printHisName();


        int b = pClass.getA();


    }
}
