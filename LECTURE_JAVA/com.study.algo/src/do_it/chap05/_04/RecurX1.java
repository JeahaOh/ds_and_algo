package do_it.chap05._04;

import do_it.Input;

public class RecurX1 {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        recur(x);
    }
}
