package do_it.chap05._05;

import do_it.Input;
import do_it.chap04._01.IntStack;

public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);
        
        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            
            if (!s.isEmpty()) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            
            break;
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        recur(x);
    }
}
