package do_it.chap01.Ex._01;

import java.util.Scanner;

/**
 * 연습 1-1
 * 네 값의 최댓값 구하여 출력
 */
public class Max4 {
    
    // a, b, c, d의 max
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
    
        System.out.print("a : ");  a = sc.nextInt();
        System.out.print("b : ");  b = sc.nextInt();
        System.out.print("c : ");  c = sc.nextInt();
        System.out.print("d : ");  d = sc.nextInt();
    
        System.out.println(max4(a, b, c, d));
    }
}
