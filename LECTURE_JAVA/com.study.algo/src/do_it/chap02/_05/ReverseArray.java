package do_it.chap02._05;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N : ");
        int num = sc.nextInt();
        
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        
        reverse(x);
        
        System.out.println(" x = " + Arrays.toString(x));
    }
}
