import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] numbers, int target) {
        Queue<Integer> queue = new LinkedList<>();
        // 초기화
        queue.offer(0);
        
        for (int num : numbers) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                // 다음 원소를 더한 경우
                queue.offer(curr + num);
                // 다음 원소를 뺀 경우
                queue.offer(curr - num);
            }
        }
        
        int answer = 0;
        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer++;
            }
        }
        
        return answer;
    }
}