package do_it.chap01.Ex._10;

import java.util.Scanner;

// 연습 1-10
// 양의 정숫값의 자릿수 구하기
public class DigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, origin;
        do {
            System.out.print("N : ");
            origin = sc.nextInt();
        } while (origin <= 0);
        n = origin;
        
        int no = 0;
        while (n > 0) {
            n /= 10;
            no++;
        }
        
        System.out.println(origin + " has " + no + " digits");
    }
}
