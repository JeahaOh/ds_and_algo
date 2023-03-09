package do_it.chap03._03.EX;

import do_it.Input;

// 연습 3-3
// 특정 값을 갖는 배열 안의 모든 요소를 다른 배열에 copy
public class SearchIndex {
  // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 모든 요소의 인덱스를
  // 배열 idx의 앞쪽부터 순서대로 저장하고 일치하는 요소의 수를 반환
  private static int searchIdx(int[] a, int n, int key, int[] idx) {
    // key와 일치하는 요소수
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == key)
        idx[count++] = i;
    }

    return count;
  }

  public static void main(String[] args) {
    int num = Input.number("element");
    int[] x = new int[num];
    int[] y = new int[num];

    for (int i = 0; i < num; i++) {
      x[i] = Input.number("x[" + i + "]");
    }

    int ky = Input.number("search");

    int count = searchIdx(x, num, ky, y);

    if (count == 0)
      System.out.println("X");
    else
      for (int i = 0; i < count; i++)
        System.out.println("x[" + y[i] + "]");
  }
}
