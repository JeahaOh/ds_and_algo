package do_it.chap01;

import java.util.Scanner;

// 양수만 입력하여 1, 2, ..., n의 합과 그 과정 2
public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("N : ");
            n = sc.nextInt();
        } while (n <= 0);
        
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
                System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(n + " = ");
        sum += n;
        
        System.out.println(sum);
    }
}
