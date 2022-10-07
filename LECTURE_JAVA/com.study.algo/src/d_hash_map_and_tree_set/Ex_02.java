package d_hash_map_and_tree_set;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Ex_02 {
    public static Map<Character, Integer> distruct(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        return map;
    }
    
    public static String solution(String first, String second) {
        if (first.length() != second.length()) return "NO";
        
        Map<Character, Integer> distFirst = distruct(first);
        Map<Character, Integer> distSecond = distruct(second);
        
        for (Character c : distFirst.keySet()) {
            if (!distSecond.containsKey(c)) {
                return "NO";
            }
            if (distFirst.get(c) != distSecond.get(c)) {
                return "NO";
            }
        }
        
        return "YES";
    }
    
    public static String solution2(String first, String second) {
        String answer = "YES";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : first.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : second.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }
        
        return answer;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        System.out.println(solution(first, second));
        System.out.println(solution2(first, second));
    }
}