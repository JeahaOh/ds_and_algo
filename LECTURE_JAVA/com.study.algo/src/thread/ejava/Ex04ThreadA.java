package thread.ejava;

public class Ex04ThreadA extends Thread {
    public Ex04ThreadA() {
        setName("ThreadA");
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName());
        }
    }
}
