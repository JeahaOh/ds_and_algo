package thread.ejava.ex09._05interrupted;

public class Main {
    public static void main(String[] args) {
        Thread t = new ErrPrintThread();
        t.start();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        t.interrupt();
    }
}

