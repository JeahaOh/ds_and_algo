package do_it.chap06._08;

import do_it.Input;

public class Partition {
    private static final String TITLE = "PARTITION";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    // 배열을 나눔
    static void partition(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int x = arr[n / 2];
        
        do {
            while (arr[left] < x) left++;
            while (arr[right] > x) right--;
            if (left <= right) swap(arr, left++, right--);
        } while (left <= right);
        
        System.out.println("Pivot : " + x);
        
        System.out.println("group under pivot");
        for (int i = 0; i <= left - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        if (left > right + 1) {
            System.out.println("Same group of Pivot");
            // arr[right + 1] ~ arr[left - 1]
            for (int i = right + 1; i <= left - 1; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
        
        System.out.println("group over pivot");
        // arr[right + 1] ~ arr[n - 1]
        for (int i = right + 1; i < n; i++)  System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println(TITLE);
        int numberOfElement = Input.integer("number of element");
        int[] arr = new int[numberOfElement];
    
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = Input.integer("x[" + i + "]");
        }
    
        System.out.println("split array");
        partition(arr, numberOfElement);
    }
}
