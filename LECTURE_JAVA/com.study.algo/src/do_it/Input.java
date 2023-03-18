package do_it;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int integer(String msg) {
        int n;
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.print(msg + " : ");
            try {
                n = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("not a number");
                n = - 1;
            }
        } while (n <= 0);
        
        return n;
    }
    
    public static double aDouble(String msg) {
        double n;
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.print(msg + " : ");
            try {
                n = sc.nextDouble();
            } catch (InputMismatchException ime) {
                System.out.println("not a number");
                n = - 1;
            }
        } while (n <= 0);
        
        return n;
    }
}
