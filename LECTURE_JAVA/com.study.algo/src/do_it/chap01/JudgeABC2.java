package do_it.chap01;

import java.util.Scanner;

// 입력한 정숫값을 판단(2)
public class JudgeABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        int n = sc.nextInt();
        
        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else if (n == 3)
            System.out.println("C");
    }
}
