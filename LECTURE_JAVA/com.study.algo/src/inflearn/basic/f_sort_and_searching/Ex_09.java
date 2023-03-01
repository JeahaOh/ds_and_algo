package inflearn.basic.f_sort_and_searching;

import java.util.Scanner;
import java.util.Arrays;

public class Ex_09 {
    public static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        
        return cnt;
    }
    
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
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