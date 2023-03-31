class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        while (a != b) {
            // 각 번호가 홀수면 ++
            if (a % 2 != 0) a++;
            if (b % 2 != 0) b++;
            
            // 다음 회차 그룹 번호는 x /= 2
            a /= 2;
            b /= 2;
            
            // 같은 그룹이 아니면 ++
            answer++;
        }
        
        return answer;
    }
}