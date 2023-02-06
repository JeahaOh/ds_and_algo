package thread.ejava.ex09._01yield;

public class ThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;
    
    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("Thread A work");
            } else {
                System.out.println("Thread A yield");
                Thread.yield();
            }
        }
        System.out.println("Thread A work end");
    }
}
