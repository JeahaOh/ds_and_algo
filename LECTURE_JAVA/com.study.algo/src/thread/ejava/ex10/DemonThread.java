package thread.ejava.ex10;

public class DemonThread extends Thread {
    public void work() {
        System.out.println("WORK");
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                break;
            }
            work();
        }
    }
}
