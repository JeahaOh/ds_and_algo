package do_it.chap05._01.EX;

import do_it.Input;

// 팩토리얼 값을 재귀가 아닌 방법으로 구하기
public class FactorialLoop {
  static int factorial(int n) {
    int fact = 1;

    while (n > 1) fact *= n--;

    return fact;
  }

  public static void main(String[] args) {
    int x = Input.integer("integer");

    System.out.println("!" + x + " is " + factorial(x));
  }
}
