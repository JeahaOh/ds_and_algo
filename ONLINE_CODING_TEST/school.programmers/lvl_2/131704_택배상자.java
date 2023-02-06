import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
  public int solution(int[] order) {
    Queue<Integer> belt = new LinkedList<>();
    Stack<Integer> sub = new Stack<>();
    int answer = 0, prev = 0;
    
    for (int i = 0; i < order.length; i++) {
      belt.offer(i + 1);
    }
    
    for (int j : order) {
      while (true) {
        // 이전보다 작다면
        if (j < prev) {
          // 보조 벨트에서 확인
          if (sub.peek() == j) {
            prev = sub.pop();
            answer++;
            break;
          } else {
            return answer;
          }
        } else if (!belt.isEmpty()) {
          // 메인 벨트에서 확인
          if (belt.peek() == j) {
            prev = belt.poll();
            answer++;
            break;
          } else {
            sub.push(belt.poll());
          }
        }
      }
    }
    
    return answer;
  }
}