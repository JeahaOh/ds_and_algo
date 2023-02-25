package do_it.chap01;

import java.util.Scanner;

// 2자리의 양수(10 ~ 99)를 입력 드모르간 법칙
public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
    
        do {
            System.out.print("N : ");
            no = sc.nextInt();
        } while (no < 10 || no > 99);
    
        System.out.println("NO : " + no);
    }
}
