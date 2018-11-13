package ir.mftvanak.library.bistAban;

public class ConstructorExampleClass {


    String name = "";

//    ConstructorExampleClass(){
//      System.out.print("Im in Constructor!");
//    }

   private ConstructorExampleClass(String newName){
      System.out.print("Im in Constructor!" + newName);
      name = newName;
    }
//    ConstructorExampleClass(String newName,String newFamily){
//      System.out.print("Im in Constructor!");
//      name = newName;
//    }
}
