package thread.ejava.ex04_thread_name;

public class ThreadA extends Thread {
    public ThreadA() {
        setName("ThreadA");
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName());
        }
    }
}
