package h_advance_dfs_and_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex_05 {
    static int answer = Integer.MAX_VALUE;
    static int n, m;
    
    public static void dfs(int l, int sum, Integer[] arr) {
        // 목표치를 넘거나, 이미 구한 값보다 레벨이 크다면 끝낸다
        if (sum > m || l >= answer) return;
        else if (sum == m) {
            answer = Math.min(answer, l);
        } else {
            // 동전의 갯수가 n 개 이므로 반복문으로 가지를 뻗어 나간다.
            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum + arr[i], arr);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 최소갯수를 구하는 문제이므로 내림차순으로 답을 구하는 것이 빠르다
        Arrays.sort(arr, Collections.reverseOrder());
        
        m = sc.nextInt();
        
        dfs(0, 0, arr);
        
        System.out.println(answer);
    }
}