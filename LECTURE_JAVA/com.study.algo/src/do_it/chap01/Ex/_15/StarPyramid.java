package do_it.chap01.Ex._15;


import java.util.Scanner;

// n단의 피라미드 만들기
public class StarPyramid {
    private static void starPyramid(int n) {
        // i = 1, 2, ..., n
        for (int i = 1; i <= n; i++) {
            // n - i => ' '
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
            // (i - 1) * 2 + 1 => '*'
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print('*');
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
        
        starPyramid(n);
    }
}
