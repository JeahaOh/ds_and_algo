package thread.ejava.ex09._03wait;

public class ThreadA extends Thread {
    private Work w;
    
    public ThreadA(Work w) {
        this.w = w;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            w.workA();
        }
    }
}
