package ir.mftvanak.library.twentysecondOfAban;

public class ThreadExampleByRunableInterface implements Runnable {


    @Override
    public void run() {
        //every thing that runs inside run func ,
        // will be executed in another thread






        System.out.print(Thread.currentThread().getName());
    }
}
