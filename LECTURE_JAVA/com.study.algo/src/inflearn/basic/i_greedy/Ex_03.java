package inflearn.basic.i_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 결혼식
 */
public class Ex_03 {
    final static class Time implements Comparable<Time> {
        public int time;
        public char state;
        Time (int time, char state) {
            this.time = time;
            this.state = state;
        }
        
        @Override
        public int compareTo(Time ob) {
            if (this.time == ob.time) return this.state - ob.state;
            else return this.time - ob.time;
        }
    }
    
    public int solution(List<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        
        for (Time t : arr) {
            if (t.state == 's') cnt++;
            else cnt--;
            
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Ex_03 T = new Ex_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr.add(new Time(st, 's'));
            arr.add(new Time(et, 'e'));
        }
        
        System.out.println(T.solution(arr));
    }
}
