package thread.ejava.ex09._03wait;

public class Work {
    public synchronized void workA() {
        System.out.println("Thread A's MethodA()");
        notify();
        try {
            wait();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    
    public synchronized void workB() {
        System.out.println("Thread B's MethodA()");
        notify();
        try {
            wait();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
