package do_it.chap02._06.EX;

import java.util.Scanner;

// 입력 받은 10w 진수를 2 ~ 32 진수로 기수 변환 과정과 결과 출력
public class CardConvEx {
    // 정수값 x를 r 진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수 반환
    static int cardConv(int x, int r, char[] d) {
        // 변환 전 자릿수
        int n = ((Integer)x).toString().length();
        // 반환 후 자릿수
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
        do {
            System.out.printf("   +" + ("-".repeat(n + 2)) + "\n");

            if (x / r != 0) {
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x, x / r, x % r);
            } else {
                System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
            }

            // r로 나눈 나머지 저장
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        
        // d의 숫자 문자열을 역순으로 정렬
        for (int i = 0; i < digits / 2; i++) {
            d[i] ^= d[digits - i - 1];
            d[digits - i - 1] ^= d[i];
            d[i] ^= d[digits - i - 1];
        }
        
        return digits;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변환할 정수
        int no;
        // 기수
        int cd;
        // 변환 후 자릿수
        int dno;
        // 재시도 여부
        int retry;
        // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열
        char[] cno = new char[32];
        
        System.out.println("10 진수의 기수를 변환 함");
        
        do {
            System.out.println("-".repeat(20));
            do {
                System.out.print("음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);
            
            do {
                System.out.print("변환할 진수 (2 ~ 36) : ");
                cd = sc.nextInt();
            } while (2 > cd || cd > 36);
            
            // no를 cd 진수로 변환
            dno = cardConv(no, cd, cno);
            System.out.print("\n" + no + "의 " + cd + "진수 = ");
            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("\n");
            
            System.out.print("다시 하려면 1 : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
