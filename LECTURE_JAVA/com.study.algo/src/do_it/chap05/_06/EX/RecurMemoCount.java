package do_it.chap05._06.EX;

import do_it.Input;

// 메모이제이션 재귀 호출 횟수 카운트
public class RecurMemoCount {
    
    static String[] memo;
    static int count;
    
    static void recur(int n) {
        count++;
        
        if (memo[n + 1] != null) {
            // 메모 출력
            System.out.println(memo[n + 1]);
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);

                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }

    }
    
    public static void main(String[] args) {
        int x = Input.integer("X");
        
        memo = new String[x + 2];
        recur(x);
        
        System.out.println("\ncount : " + count);
    }
}
