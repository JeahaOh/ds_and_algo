import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int position : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][position - 1] != 0)  {
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
}