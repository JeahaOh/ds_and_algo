package do_it.chap01;

import java.util.Scanner;

// 1, 2, …, n 의 합을 구합니다.(구하는 과정의 식을 출력 :２[개선])
public class SumVerbose2A {
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
        System.out.print(n + " = " + (sum += n));
    }
}
