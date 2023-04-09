package do_it.chap05._01;

import do_it.Input;

// 팩토리얼 값을 재귀적으로 구함
public class Factorial {
    // 음이 아닌 정수 n의 팩토리얼 값을 반환
    static int factorial(int n) {
        if (n > 0) return n * factorial(n - 1);
        else return 1;
    }
    
    public static void main(String[] args) {
        int x = Input.integer("Integer");
        
        System.out.println("factorial " + x + " is " + factorial(x));
    }
}
