import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        
        // two pointer
        int left = 0;
        for (int right = people.length - 1; left <= right; right--) {
            if (people[right] + people[left] <= limit) {
                // 각 끝점의 합이 허용치 이하라면 둘다 태워 보냄.
                left++;
                answer++;
            } else {
                // 허용치 이상이면 right만 태워 보냄.
                answer++;
            }
        }
        
        return answer;
    }
}