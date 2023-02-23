package do_it.chap01;

import java.util.Scanner;

// for 문으로 1, 2, …, n의 합을 구함
public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("sum 1 ~ n");
        System.out.print("n : ");
        int n = sc.nextInt();
    
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    
        System.out.println("1 ~ " + n + " = " + sum);
    }
}
