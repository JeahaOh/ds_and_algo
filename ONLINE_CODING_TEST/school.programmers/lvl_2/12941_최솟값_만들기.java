import java.util.Arrays;
/**
* 누적이 최소가 된다 -> loop의 각 회차에서 최소를 만들어야 한다
* loop의 각 회차가 최소가 된다 -> 가장 큰 값과 가장 작은 값을 곱한다
*/
class Solution {
  public int solution(int []A, int []B) {
    int answer = 0;
    Arrays.sort(A);
    Arrays.sort(B);
    
    for (int i = 0; i < A.length; i++) {
      answer += (A[i] * B[B.length - i - 1]);
    }

    return answer;
  }
}