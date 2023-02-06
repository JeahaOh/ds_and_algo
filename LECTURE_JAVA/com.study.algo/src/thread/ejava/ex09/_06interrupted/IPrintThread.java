package thread.ejava.ex09._06interrupted;

public class IPrintThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("RUN");
            if (Thread.interrupted()) {
                break;
            }
        }
        
        System.out.println("CLEAN");
        System.out.println("END");
    }
}
