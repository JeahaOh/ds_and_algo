import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];
    List<String> list = new ArrayList<String>();
    String curr, prev;
    
    for (int i = 0; i < words.length; i++) {
      curr = words[i];
      
      if (i > 0) {
        prev = words[i - 1];
        // 이전에 등장했는가?
        boolean isDupl = list.contains(curr);
        // 끝말 잇기가 맞는가?
        boolean isWordChain = prev.charAt(prev.length() - 1) == curr.charAt(0);
        
        // 중복이거나, 끝말 잇기가 성립 안된다면
        if (isDupl || !isWordChain) {
          // 회차
          answer[0] = (i % n) + 1;
          // 차례
          answer[1] = (i / n) + 1;
          break;
        }
      }
      
      list.add(curr);
    }

    return answer;
  }
}