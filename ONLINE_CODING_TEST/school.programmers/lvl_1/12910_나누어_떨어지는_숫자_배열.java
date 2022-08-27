import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = null;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }
        
        if (list.size() == 0 || list.isEmpty()) {
            answer = new int[]{-1};
            return answer;
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        int idx = 0;
        for (int i : list) {
            answer[idx++] = i;
        }
        return answer;
    }
}