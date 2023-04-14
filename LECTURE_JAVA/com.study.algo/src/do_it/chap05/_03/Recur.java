package do_it.chap05._03;

import do_it.Input;

// 재귀 함수의 이해
public class Recur {
    // 재귀
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        recur(x);
    }
}
