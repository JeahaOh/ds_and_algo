package do_it.chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구하여 출력
public class Max3 {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("세 정수의 최댓값을 구한다.");
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
        System.out.println("c : ");
        int c = sc.nextInt();
        
        System.out.println("MAX is " + max3(a, b, c));
        System.out.println("-".repeat(10));
        
        System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
        System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
        System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
        System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
        System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
        System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
        System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
        System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
        System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
        System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
    
        System.out.println("-".repeat(10));
    }
}
