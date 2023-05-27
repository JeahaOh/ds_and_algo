package KDT.week03._03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class P {
    int open, close;
    P (int open, int close) {
        this.open = open;
        this.close = close;
    }
}

public class CorrectBracketsCount {
    
    // DFS 깊이 우선 탐색
//    public static int solution(int n) {
//        int answer = 0;
//
//        Stack<P> stck = new Stack<>();
//        stck.push(new P(0, 0));
//
//        while (!stck.isEmpty()) {
//            P p = stck.pop();
//
//            if (p.open > n) continue;
//            if (p.open < p.close) continue;
//            if (p.open + p.close == 2 * n) {
//                answer++;
//                continue;
//            }
//
//            stck.push(new P(p.open + 1, p.close));
//            stck.push(new P(p.open, p.close + 1));
//        }
//
//        return answer;
//    }
    
    // BFS 너비우선 탐색
    public static int solution(int n) {
        int answer = 0;
        
        Queue<P> stck = new LinkedList<>();
        stck.offer(new P(0, 0));
        
        while (!stck.isEmpty()) {
            P p = stck.poll();
            
            if (p.open > n) continue;
            if (p.open < p.close) continue;
            if (p.open + p.close == 2 * n) {
                answer++;
                continue;
            }
            
            stck.offer(new P(p.open + 1, p.close));
            stck.offer(new P(p.open, p.close + 1));
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(3));
    }
}
