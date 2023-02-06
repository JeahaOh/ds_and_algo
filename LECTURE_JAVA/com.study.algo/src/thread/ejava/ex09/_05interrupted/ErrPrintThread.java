package thread.ejava.ex09._05interrupted;

public class ErrPrintThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("RUN");
                Thread.sleep(10);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        System.out.println("CLEAN");
        System.out.println("END");
    }
}
