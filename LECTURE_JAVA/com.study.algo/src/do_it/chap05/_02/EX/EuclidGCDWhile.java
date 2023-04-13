package do_it.chap05._02.EX;

import do_it.Input;

// 유클리드 호제법에 의해 최대 공약수를 비재귀적으로 구하기
public class EuclidGCDWhile {
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        int x = Input.integer("integer x");
        int y = Input.integer("integer y");
        
        System.out.println(gcd(x, y));
    }
}
