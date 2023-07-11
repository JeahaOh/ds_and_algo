import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> longing = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            longing.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            String[] pic = photo[i];
            int score = 0;
            
            for (String nm : pic) {
                score += longing.getOrDefault(nm, 0);
            }
            answer[i] = score;
        }
        
        return answer;
    }
}