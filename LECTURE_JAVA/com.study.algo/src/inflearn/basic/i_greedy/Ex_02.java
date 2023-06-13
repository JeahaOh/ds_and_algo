package inflearn.basic.i_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 회의실 배정
 */
public class Ex_02 {
    final static class Time implements Comparable <Time> {
        public int s, e;
        Time(int s, int e) {
            this.s = s;
            this.e = e;
        }
        
        @Override
        public int compareTo(Time o) {
            if (this.e == o.e) return this.s - o.s;
            else return this.e - o.e;
        }
    }
    
    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        
        int endTime = 0;
        for (Time ob : arr) {
            if (ob.s >= endTime) {
                cnt ++;
                endTime = ob.e;
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        Ex_02 T = new Ex_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }
        
        System.out.println(T.solution(arr, n));
    }
}
