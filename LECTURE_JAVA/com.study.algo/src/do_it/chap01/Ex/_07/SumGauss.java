package do_it.chap01.Ex._07;

import java.util.Scanner;

// 연습1-7
// 가우스 공식을 사용하여 1, 2, ..., n의 총합 구하기
public class SumGauss {
    public static int sumGauss(int n) {
        return (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.println("SUM of Gauss, 1 ~ " + n + " is " + sumGauss(n));
    }
}
