class Solution {
  public int solution(int n) {
    int answer = 0;
    int fibo1 = 0, fibo2 = 1;
    
    for (int i = 2; i <= n; i++) {
      answer = (fibo1 + fibo2) % 1234567;
      fibo1 = fibo2;
      fibo2 = answer;
    }
    
    return answer;
  }
}