package do_it.chap01.Ex._14;

import java.util.Scanner;

// 직각 이등변 삼각형 만들기
public class Triangle {
    // 왼쪽 아래가 직각인 이등변삼각형
    private static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
        
            System.out.println();
        }
    }
    
    // 왼쪽 위가 직각인 이등변삼각형
    private static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("*");
        
            System.out.println();
        }
    }
    // 오른쪽 위가 직각인 이등변삼각형
    private static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = i; j <= n; j++)
                System.out.print("*");
        
            System.out.println();
        }
    }
    // 오른쪽 아래가 직각인 이등변삼각형
    private static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
        
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
    
        System.out.println("-".repeat(10));
        triangleLB(n);
        
        System.out.println("-".repeat(10));
        triangleLU(n);
        
        System.out.println("-".repeat(10));
        triangleRB(n);
        
        System.out.println("-".repeat(10));
        triangleRU(n);
        
    }
}
