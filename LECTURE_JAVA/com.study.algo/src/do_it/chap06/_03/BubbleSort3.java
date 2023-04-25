package do_it.chap06._03;

import do_it.Input;

// 버블정렬 버전 3 교환 횟수에 따른 멈춤
public class BubbleSort3 {
    
    private static final String TITLE = "BUBBLE SORT VOL. 3";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    static void bubbleSort(int[] arr, int length) {
        // a[k] 보다 앞쪽은 정렬을 마침
        int k = 0;
        // 마지막으로 교환한 위치
        while (k < length - 1) {
            int last = length - 1;
            for (int j = length - 1; j > k; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    last = j;
                }
            }

            k = last;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(TITLE);
        int numberOfElement = Input.integer("number of element");
        int[] arr = new int[numberOfElement];
        
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = Input.integer("x[" + i + "]");
        }
        
        System.out.println("Sort as ASCENDING");
        bubbleSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}
