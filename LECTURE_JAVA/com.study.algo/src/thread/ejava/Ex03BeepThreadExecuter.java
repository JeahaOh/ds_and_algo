package thread.ejava;

public class Ex03BeepThreadExecuter {
    public static void main(String[] args) {
        Thread t = new Ex03BeepThread();
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
