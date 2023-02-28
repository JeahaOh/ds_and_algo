package do_it.chap01;

import java.util.Scanner;

// 직각 이등변 삼각형 출력하기
public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
