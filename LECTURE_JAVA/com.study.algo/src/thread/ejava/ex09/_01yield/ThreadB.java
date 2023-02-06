package thread.ejava.ex09._01yield;

public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;
    
    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("Thread B work");
            } else {
                System.out.println("Thread B yield");
                Thread.yield();
            }
        }
        System.out.println("Thread B work end");
    }
}
