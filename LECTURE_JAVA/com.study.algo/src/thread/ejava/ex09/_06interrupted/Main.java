package thread.ejava.ex09._06interrupted;

public class Main {
    public static void main(String[] args) {
        Thread t = new IPrintThread();
        t.start();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        t.interrupt();
    }
}

