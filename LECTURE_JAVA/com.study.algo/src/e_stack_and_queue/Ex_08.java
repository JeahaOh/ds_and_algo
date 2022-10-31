package e_stack_and_queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Ex_08 {
    public class Priority {
        int no;
        int priority;
        
        public Priority(int no, int priority) {
            this.no = no;
            this.priority = priority;
        }
    }
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Priority> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            q.offer(new Priority(i, arr[i]));
        }
        
        while (!q.isEmpty()) {
            Priority temp = q.poll();
            for (Priority x : q) {
                if (x.priority > temp.priority) {
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            
            if (temp != null) {
                answer++;
                if (temp.no == m) return answer;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Ex_08 ex = new Ex_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(ex.solution(n, m, arr));
    }
}