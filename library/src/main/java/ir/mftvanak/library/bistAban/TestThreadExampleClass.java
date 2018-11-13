package ir.mftvanak.library.bistAban;

public class TestThreadExampleClass {

    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getName());

        //main Thread
        Thread thread = new Thread(new ThreadClassByRunnable());
        thread.start();
    }
}
