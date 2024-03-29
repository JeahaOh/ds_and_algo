package inflearn.basic.i_greedy;

import java.util.*;

/**
 * 씨름 선수
 */

public class Ex_01 {
    static class Body implements Comparable <Body> {
        public int h, w;
        Body(int h, int w) {
            this.h = h;
            this.w = w;
        }
        
        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }
    
    public int solution(List<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        
        for (Body ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        Ex_01 T = new Ex_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Body> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        
        System.out.println(T.solution(arr, n));
    }
}
