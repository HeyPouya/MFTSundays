package ir.mftvanak.library.twentysecondOfAban;

public class ThreadExampleByThreadClass extends Thread {

    @Override
    public void run() {
        super.run();

        //every thing that runs inside run func ,
        // will be executed in another thread


        System.out.print(Thread.currentThread().getName());

    }
}
