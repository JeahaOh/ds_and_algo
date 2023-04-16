package do_it.chap05._07.EX;

import do_it.Input;

// 비 재귀적으로 변경
public class Recur3 {
    static void recur3(int n) {
        int[] nstk = new int[100];
        int[] sstk = new int[100];
        
        int ptr = -1;
        int sw = 0;
        
        while (true) {
            if (n > 0) {
                ptr++;
                nstk[ptr] = n;
                sstk[ptr] = sw;
                
                if (sw == 0) {
                    n -= 1;
                } else if (sw == 1) {
                    n -= 2;
                    sw = 0;
                }
                
                continue;
            }
            
            do {
                n = nstk[ptr];
                sw = sstk[ptr--] + 1;
                
                if (sw == 2) {
                    System.out.println(n);
                    if (ptr < 0) {
                        return;
                    }
                }
            } while (sw == 2);
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        recur3(x);
    }
}
