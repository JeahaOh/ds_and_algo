package do_it.chap01;

import java.util.Scanner;

// *를 n개 출력하되 w개마다 줄 바꿈(1)
public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;
    
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
    
        do {
            System.out.print("W : ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);
        
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            
            if (i % w == w - 1)
                System.out.println();
        }
        
        if (n % w != 0)
            System.out.println();
    }
}
