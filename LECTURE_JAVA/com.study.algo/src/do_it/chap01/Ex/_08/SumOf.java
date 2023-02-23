package do_it.chap01.Ex._08;

import java.util.Scanner;

// 연습1-8
// 정수a, b를 포함하여 그 사이의 모든 정수의 총합을 구합니다
public class SumOf {
    public static int sumOf(int a, int b) {
        int sum = 0;
        
        if (a > b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        
        for (; a <= b; a++)
            sum += a;
        
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = sc.nextInt();
        
        System.out.print("b : ");
        int b = sc.nextInt();
        
        System.out.println(sumOf(a, b));
    }
}
