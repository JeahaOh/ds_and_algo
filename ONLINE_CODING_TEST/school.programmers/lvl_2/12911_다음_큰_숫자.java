class Solution {
  public int solution(int n) {
    int answer = 0;
    int oneCnt = 0;
    // Integer.bitCount : n을 이진변환 후 1의 갯수
    int datumOneCnt = Integer.bitCount(n);
    
    // n을 증가, 이진 변환한 수의 1의 갯수를 기준수와 비교, 같다면 끝.
    while (true) {
      n++;
      oneCnt = Integer.bitCount(n);
      if (oneCnt == datumOneCnt) {
        answer = n;
        break;
      }
    }
    
    return answer;
  }
}