package f_sort_and_searching;

import java.util.Scanner;
import java.util.Arrays;

public class Ex_08 {
    // 이분검색
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            
            if (arr[mid] > m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(solution(n, m, arr));
    }
}