package do_it.chap01;

import java.util.Scanner;

// +와 -를 번갈아 출력(1)(개선)
public class Alternative1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print("-");
            else
                System.out.print("+");
        }
    }
}
