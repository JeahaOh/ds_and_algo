package do_it.chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) return b;
            else if (a <= c) return a;
            else return c;
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("세 정수의 중앙값을 구한다.");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        
        System.out.println("MED is " + med3(a, b, c));
        System.out.println("-".repeat(10));
    }
}
