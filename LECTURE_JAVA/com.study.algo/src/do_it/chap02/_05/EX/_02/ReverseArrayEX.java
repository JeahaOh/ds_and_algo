package do_it.chap02._05.EX._02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArrayEX {
    private static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(Arrays.toString(arr));
            
            int right = i, left = arr.length - i - 1;
            System.out.println(String.format("SWAP a[%d] and a[%d]", right, left));
            swap(arr, i, arr.length - i - 1);
        }
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num;
        do {
            num = rand.nextInt(10);
        } while (2 >= num && num <=10);
        System.out.println("N : " + num);
        
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++) {
            x[i] = rand.nextInt(20);
            System.out.println("x[" + i + "] : " + x[i]);
        }
        
        reverse(x);
        
        System.out.println(Arrays.toString(x));
    }
}
