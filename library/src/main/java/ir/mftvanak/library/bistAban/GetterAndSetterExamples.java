package ir.mftvanak.library.bistAban;

public class GetterAndSetterExamples {


    private int age = 30;

    public static void main(String[] args) {

//        ConstructorExampleClass constructor = new ConstructorExampleClass();

//        ConstructorExampleClass constructor1 = new ConstructorExampleClass("Pouya");


        ToStringExample example = new ToStringExample();
        String s = example.toString();
        System.out.print(s);
    }


    //getter for age
    public int getAge() {
        return age + 10;
    }

    public void setAge(int customAge) {
        age = customAge - 10;
    }


}
