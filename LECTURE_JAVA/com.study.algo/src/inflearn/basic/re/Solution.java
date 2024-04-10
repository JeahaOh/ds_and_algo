package inflearn.basic.re;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int x : solution(n, arr1, m, arr2)) {
            System.out.printf("%d ", x);
        }
    }
    
    public static List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        
        int idxI = 0;
        int idxJ = 0;
        while (idxI < n && idxJ < m) {
            if (arr1[idxI] < arr2[idxJ]) answer.add(arr1[idxI++]);
            else answer.add(arr2[idxJ++]);
        }
        
        while (idxI < n) answer.add(arr1[idxI++]);
        while (idxJ < m) answer.add(arr2[idxJ++]);
        
        return answer;
    }
}
