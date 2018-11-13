package ir.mftvanak.library.bistAban;

public class ThreadClassByRunnable implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());

    }
}
