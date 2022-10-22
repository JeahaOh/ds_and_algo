package d_hash_map_and_tree_set;

import java.util.*;

public class Ex_04 {
    public static int solution(String a, String b) {
        int answer = 0;
        
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();
        
        for (char c : b.toCharArray()) bm.put(c, bm.getOrDefault(c, 0) + 1);
        
        int L = b.length() - 1;
        
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        
        int left = 0;
        for (int right = L; right < a.length(); right++) {
            am.put(a.charAt(right), am.getOrDefault(a.charAt(right), 0) + 1);
            
            if (am.equals(bm)) answer++;
            
            am.put(a.charAt(left), am.get(a.charAt(left)) - 1);
            
            if (am.get(a.charAt(left)) == 0) am.remove(a.charAt(left));
            
            left++;
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        
        System.out.println(solution(s, t));
    }
}