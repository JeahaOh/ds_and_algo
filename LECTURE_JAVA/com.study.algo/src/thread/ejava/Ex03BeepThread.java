package thread.ejava;

import java.awt.*;

public class Ex03BeepThread extends Thread {
    
    @Override
    public void run() {
        Toolkit tookit = Toolkit.getDefaultToolkit();
    
        for (int i = 0; i < 5; i++) {
            tookit.beep();
        
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
