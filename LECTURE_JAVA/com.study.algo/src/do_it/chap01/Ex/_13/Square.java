package do_it.chap01.Ex._13;

import java.util.Scanner;

// 연습1-13 정사각형을 출력
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
