package do_it.chap01.Ex._03;

import java.util.Scanner;

/**
 * 연습 1-3
 * 네 값의 최솟값
 */
public class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.print("a : ");  a = sc.nextInt();
        System.out.print("b : ");  b = sc.nextInt();
        System.out.print("c : ");  c = sc.nextInt();
        System.out.print("d : ");  d = sc.nextInt();
        
        System.out.println("MIN IS " + min4(a, b, c, d));
    }
}
