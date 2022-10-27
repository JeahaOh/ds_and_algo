package e_stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class Ex_04 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int right = stack.pop(), left = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(left + right);
                        break;
                    case '-':
                        stack.push(left - right);
                        break;
                    case '*':
                        stack.push(left * right);
                        break;
                    case '/':
                        stack.push(left / right);
                        break;
                }
            }
        }
        
        answer = stack.peek();
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}