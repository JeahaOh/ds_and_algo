package inflearn.basic.e_stack_and_queue;

import java.util.*;

public class Ex_07 {
    public static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char c : need.toCharArray()) {
            q.offer(c);
        }
        
        for (char c : plan.toCharArray()) {
            if (q.contains(c)) {
                if (q.poll() != c) {
                    return "NO";
                }
            }
        }
        
        if (!q.isEmpty()) return "NO";
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }
}