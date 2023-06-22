package inflearn.basic.j_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 가장 높은 탑 쌓기
 */
public class Ex_04 {
    
    private final static class Brick implements Comparable<Brick> {
        public int s, height, weight;
        Brick (int s, int height, int weight) {
            this.s = s;
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }
    
    static int[] dy;
    
    public int solution(List<Brick> arr) {
        Collections.sort(arr);
        int answer = 0;
        
        dy[0] = arr.get(0).height;
        answer = dy[0];
        
        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).weight > arr.get(i).weight && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            
            dy[i] = max_h + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Ex_04 t = new Ex_04();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Brick> arr = new ArrayList<>();
        dy = new int[n];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Brick(a, b, c));
        }
        
        System.out.println(t.solution(arr));
    }
}
