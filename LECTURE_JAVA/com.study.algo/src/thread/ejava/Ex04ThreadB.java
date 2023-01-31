package thread.ejava;

public class Ex04ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName());
        }
    }
}
