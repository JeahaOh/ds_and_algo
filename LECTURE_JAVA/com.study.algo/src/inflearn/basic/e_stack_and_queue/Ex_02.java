package inflearn.basic.e_stack_and_queue;
import java.util.*;

public class Ex_02 {
    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }
    
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}