package f_sort_and_searching;

import java.util.Scanner;

public class SelectionSort {
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i, temp;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}