package do_it.chap01;

import java.util.Scanner;

// +와 -를 번갈아 출력(2)(개선)
public class Alternative2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        for (int i = 1; i <= n / 2; i++)
            System.out.print("+-");
        
        if (n % 2 != 0)
            System.out.print("+");
    }
}
