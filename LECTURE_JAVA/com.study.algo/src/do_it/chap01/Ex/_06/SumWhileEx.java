package do_it.chap01.Ex._06;

import java.util.Scanner;

/**
 * 연습 1-6
 * 1, 2, ..., n 의 총합
 */
public class SumWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while(i <= n) {
            sum += 1;
            i++;
        }
        
        System.out.println("1 ~ " + n + " = " + sum);
        System.out.println("i = " + i);
    }
}
