package thread.ejava.Ex08;

public class StatePrintThread extends Thread {
    private Thread targetThread;
    
    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }
    
    @Override
    public void run() {
        while (true) {
            State state = targetThread.getState();
            System.out.println("target thread state : " + state);
            
            if (state == State.NEW) {
                System.out.println("State.NEW ");
                targetThread.start();
            } else if (state == State.TERMINATED) {
                System.out.println("TERMINATED ");
                break;
            }
            
            
        }
    }
}
