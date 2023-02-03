package thread.ejava.ex03;

public class Main {
    public static void main(String[] args) {
        Thread t = new BeepThread();
        t.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("BEEP");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
