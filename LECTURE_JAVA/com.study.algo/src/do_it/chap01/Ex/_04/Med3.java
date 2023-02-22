package do_it.chap01.Ex._04;

/**
 * 연습1-4
 * 세 정숫값의 중앙값을 구하여 출력(모든 대소 관계에 대하여 검증)
 */
public class Med3 {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) return b;
            else if (a <= c) return a;
            else return c;
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else return b;
    }
    
    public static void main(String[] args) {
        System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
        System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
        System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
        System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
        System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
        System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
        System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
        System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1));
        System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
        System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
        System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
        System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
    }
}
