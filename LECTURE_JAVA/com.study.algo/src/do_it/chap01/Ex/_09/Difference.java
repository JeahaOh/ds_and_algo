package do_it.chap01.Ex._09;

import java.util.Scanner;

// 연습 1-9
// 정수 b에서 정수 a 를 뺀 값 (b > a)
public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = sc.nextInt();
        
        int b;
        while (true) {
            System.out.print("b : ");
            b = sc.nextInt();
            if (b > a) break;
            System.out.println("b must bigger than a");
        }
        
        System.out.println("b - a = " + (b - a));
    }
}
