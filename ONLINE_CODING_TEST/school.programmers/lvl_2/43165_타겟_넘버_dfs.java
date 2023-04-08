import java.util.Queue;
import java.util.LinkedList;

class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int index, int sum) {
        // 배열의 모든 원소 탐색
        if (index == numbers.length) {
            if (sum == target) {
                // 타겟 넘버와 일치하는 경우 카운트
                answer++;
            }
            return;
        }
        
        // 다음 원소를 더한 경우
        dfs(numbers, target, index + 1, sum + numbers[index]);
        // 다음 원소를 뺀 경우
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}