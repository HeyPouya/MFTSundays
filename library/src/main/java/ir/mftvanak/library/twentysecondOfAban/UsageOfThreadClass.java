package ir.mftvanak.library.twentysecondOfAban;

public class UsageOfThreadClass {


    public static void main(String[] args) {

        //
//        ThreadExampleByThreadClass threadExampleByThreadClass = new ThreadExampleByThreadClass();
//
//        threadExampleByThreadClass.start();


        ThreadExampleByRunableInterface threadExampleByRunableInterface = new ThreadExampleByRunableInterface();

        Thread thread = new Thread(threadExampleByRunableInterface);

        thread.start();

    }
}
