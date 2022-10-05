package c_two_pointers_and_sliding_window;

import java.util.Scanner;

public class Ex_06 {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0, left = 0;
        
        for (int right = 0; right < n; right++) {
            
            if (arr[right] == 0) cnt++;
            
            while (cnt > k) {
                if (arr[left] == 0) cnt--;
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(solution(n, k, arr));
    }
}