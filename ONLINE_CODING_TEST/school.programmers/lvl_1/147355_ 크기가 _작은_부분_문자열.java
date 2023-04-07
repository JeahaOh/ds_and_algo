class Solution {
    // 1 ≤ p의 길이 ≤ 18
    // 10 자리가 넘어 갈 수 있기 때문에 long을 예상해야 함
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        long longP = Long.parseLong(p);
        long partialT;
        
        for (int i = 0; i + pLength <= tLength; i++) {
            partialT = Long.parseLong(t.substring(i, i + pLength));
            if (partialT <= longP) {
                answer++;
            }
        }
        
        return answer;
    }
}