package thread.ejava.ex09._03wait;

public class ThreadB extends Thread {
    private Work w;
    
    public ThreadB(Work w) {
        this.w = w;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            w.workB();
        }
    }
}
