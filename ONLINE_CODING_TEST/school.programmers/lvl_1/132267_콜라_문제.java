class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int income;
        
        // n이 a 이상인 동안 반복
        while(n >= a) {
            // 1 회에 받을 수 있는 갯수
            income = (n / a) * b;
            answer += income;
            // 남은 것 = 받은 것 + 주고 남은 것
            n = income + n % a;
        }
        
        return answer;
    }
}