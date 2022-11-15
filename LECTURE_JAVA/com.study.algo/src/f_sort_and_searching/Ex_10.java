package f_sort_and_searching;

import java.util.Scanner;
import java.util.Arrays;

public class Ex_10 {
    // 결정 알고리즘의 핵심
    public static int count(int[] arr, int distance) {
        // 마리 수
        int cnt = 1;
        int endPoint = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endPoint >= distance) {
                cnt ++;
                endPoint = arr[i];
            }
        }
        
        return cnt;
    }
    
    public static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        
        int left = 1;
        int right = arr[n - 1];
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(solution(n, c, arr));
    }
}