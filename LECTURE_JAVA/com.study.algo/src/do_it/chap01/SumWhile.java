package do_it.chap01;

import java.util.Scanner;

// while 문으로 1, 2, …, n의 합을 구함
public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("sum 1 ~ n");
        System.out.print("n : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum += i++;
        }
        
        System.out.println("1 ~ " + n + " = " + sum);
        System.out.println("i = " + i);
    }
}
