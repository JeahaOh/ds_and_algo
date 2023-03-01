package inflearn.basic.e_stack_and_queue;

import java.util.*;

public class Ex_03 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int position : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][position - 1] != 0) {
                    int temp = board[i][position - 1];
                    board[i][position - 1] = 0;
                    
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        
        System.out.println(solution(board, moves));
    }
}