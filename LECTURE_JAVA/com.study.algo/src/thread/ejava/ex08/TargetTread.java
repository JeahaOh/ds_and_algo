package thread.ejava.ex08;

public class TargetTread extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 1_000_000_000; i++) {
        
        }
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (long i = 0; i < 1_000_000_000; i++) {
        
        }
    }
}
