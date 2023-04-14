package do_it.chap05._03.EX;

import do_it.Input;

// 재귀 분석
public class Recur2 {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 2);
            System.out.println(n);
            recur(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        recur(x);
    }
}
