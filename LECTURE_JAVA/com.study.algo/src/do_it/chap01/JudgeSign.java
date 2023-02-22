package do_it.chap01;

import java.util.Scanner;

// 입력한 정숫값의 부호(양수/음수/0)를 판단
public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        int n = sc.nextInt();
        
        if (n > 0)
            System.out.println("양수");
        else if (n < 0)
            System.out.println("음수");
        else
            System.out.println("0");
    }
}
