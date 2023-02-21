package do_it.chap01.Ex._02;

import java.util.Scanner;

/**
 * 연습 1-2
 * 세 값의 최솟값을 구하여 출력
 */
public class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
        System.out.println("c : ");
        int c = sc.nextInt();
    
        System.out.println("MIN is " + min3(a, b, c));
    }
}
