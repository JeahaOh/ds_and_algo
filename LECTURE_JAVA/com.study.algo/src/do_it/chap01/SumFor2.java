package do_it.chap01;

import java.util.Scanner;

// 양수만 입력하여 1, 2, …, n의 합을 구함(do문에서 양수만을 정수 n값으로 읽음)
public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("1 ~ " + n + " = " + sum);
    }
}
