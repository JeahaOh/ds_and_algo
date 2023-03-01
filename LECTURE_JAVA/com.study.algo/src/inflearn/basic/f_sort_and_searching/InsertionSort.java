package inflearn.basic.f_sort_and_searching;

import java.util.Scanner;

public class InsertionSort {
//    public static int[] solution(int n, int[] arr) {
//        for (int i = 1; i < n; i++) {
//            int target = arr[i];
//            int j = i - 1;
//            while (j >= 0 && target < arr[j]) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = target;
//        }
//        return arr;
//    }
    
    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
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