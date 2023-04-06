import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        
        int[] answer = new int[length];
        Arrays.fill(answer, -1);
        
        for (int i = 1; i <= length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (chars[i] == chars[j]) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}