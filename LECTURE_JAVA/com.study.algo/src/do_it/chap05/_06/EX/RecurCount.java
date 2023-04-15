package do_it.chap05._06.EX;

import do_it.Input;

// 재귀 호출 횟수 카운트
public class RecurCount {
    static int count;
    
    static void recur(int n) {
        count++;
        
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        
        recur(x);
        
        System.out.println("\ncount : " + count);
    }
}
