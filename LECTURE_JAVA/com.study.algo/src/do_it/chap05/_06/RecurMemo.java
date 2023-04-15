package do_it.chap05._06;

import do_it.Input;

public class RecurMemo {
    static String[] memo;
    
    static void recur(int n) {
        if (memo[n + 1] != null) {
            // 메모가 있으면 메모 출력
            System.out.println(memo[n + 1]);
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                // 메모화
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                // 메모화 recur[0]과 recur[-1]은 빈 문자열
                memo[n + 1] = "";
            }
        }
    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        
        memo = new String[x + 2];
        recur(x);
    }
}
