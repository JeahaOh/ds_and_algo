package thread.ejava.Ex08;

public class ThreadState {
    
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetTread());
        statePrintThread.start();
    }
}

