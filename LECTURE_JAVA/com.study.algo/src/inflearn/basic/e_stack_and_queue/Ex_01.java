package inflearn.basic.e_stack_and_queue;

import java.util.*;

public class Ex_01 {
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) return "YES";
        else return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}