package do_it.chap05._02.EX;

import do_it.Input;

// 배열의 모든 요소의 최대 공약수 구하기
public class ArrayGCD {
  // GCD를 비 재귀적으로 구하기
  static int gcd(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }

    return x;
  }

  // 요소수가 n인 배열 a의 모든 요소의 최대 공약수 구하기
  static int gcdArray(int a[], int begin, int no) {
    if (no == 1) return a[begin];
    else if (no == 2) return gcd(a[begin], a[begin + 1]);
    else return gcd(a[begin], gcdArray(a, begin + 1, no - 1));
  }

  public static void main(String[] args) {
    int num;
    do {
      num = Input.integer("num");
    } while (num <= 1);

    int[] x = new int[num];
    for (int i = 0; i < num; i++) {
      x[i] = Input.integer("x[" + i + "]");
    }

    System.out.println("GCD : " + gcdArray(x, 0, num));
  }
}
