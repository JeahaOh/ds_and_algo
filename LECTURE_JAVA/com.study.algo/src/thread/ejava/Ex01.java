package thread.ejava;

import java.awt.*;

public class Ex01 {
    public static void main(String[] args) {
        Toolkit tookit = Toolkit.getDefaultToolkit();
        
        for (int i = 0; i < 5; i++) {
            tookit.beep();
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
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
