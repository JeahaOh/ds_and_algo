package thread.ejava.ex12;

public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(getName() + " is interrupted.");
                break;
            }
        }
        System.out.println(getName() + " END.");
    }
}
