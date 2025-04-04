class Solution {
  // 두 수의 최대공약수(GCD) 구하기
  private int GCD(int a, int b) {
    return b == 0 ? a : GCD(b, a % b);
  }

  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    // 두 분수를 통분
    int numer = (numer1 * denom2) + (numer2 * denom1);
    int denom = denom1 * denom2;

    // 분자와 분모의 최대공약수 구하기
    int gcd = GCD(denom, numer);

    // 각각 최대공약수로 나눠 약분, 기약분수로 만들기
    numer = numer / gcd;
    denom = denom / gcd;

    return new int[] { numer, denom };
  }
}