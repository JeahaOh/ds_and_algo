package thread.etc;

public class RaceThread {
    public static void main(String[] args) {
        Racer a = new Racer("A");
        Racer b = new Racer("B");
        Racer c = new Racer("C");
        
        a.start();
        b.start();
        c.start();
    }
}

class Racer extends Thread {
    public Racer(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "'s " + (i * 10) + "%");
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
