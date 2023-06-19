package inflearn.basic.j_dynamic_programming;

import java.util.Scanner;

/**
 * 계단 오르기
 */
public class Ex_01 {
    static int[] dy;
    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        
        return dy[n];
    }
    
    public static void main(String[] args) {
        Ex_01 t = new Ex_01();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        dy = new int[n + 1];
        
        System.out.println(t.solution(n));
    }
}
