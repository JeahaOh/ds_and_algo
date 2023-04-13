package do_it.chap05._02;

import do_it.Input;

// 유클리드 호제법으로 최대 공약수 구하기
public class EuclidGCD {
    
    // 정수 x, y를 최대 공약수를 구하여 반환
    static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }
    
    public static void main(String[] args) {
        int x = Input.integer("integer x");
        int y = Input.integer("integer y");
        
        System.out.println(gcd(x, y));
    }
}
