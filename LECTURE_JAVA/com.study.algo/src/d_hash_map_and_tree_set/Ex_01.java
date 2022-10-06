package d_hash_map_and_tree_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_01 {
    public static char solution(int n, String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> vote = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            vote.put(c, vote.getOrDefault(c, 0) + 1);
        }
        
        for (char c : vote.keySet()) {
            if (vote.get(c) > max) {
              max = vote.get(c);
              answer = c;
            }
        }
      
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        System.out.println(solution(n, str));
    }
}