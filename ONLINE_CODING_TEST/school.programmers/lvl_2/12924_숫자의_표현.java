class Solution {
  /**
   * cnt -> 자연수의 갯수
   * n에서 자연수의 갯수만큼 빼고 자연수의 갯수만큼 나눠서 그 몫이 0이면,
   * 해당 수만큼의 자연수의 합으로 해당 자연수를 조합할 수 있음.
   * ex n이 15일 때 8 + 9 = 15
   */
  public int solution(int n) {
    int answer = 1, cnt = 1;
    
    n--;
    while (n > 0) {
      cnt++;
      n -= cnt;
      if (n % cnt == 0) answer++;
    }
    
    return answer;
  }
}