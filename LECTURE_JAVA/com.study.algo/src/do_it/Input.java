package do_it;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int number(String msg) {
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
}
