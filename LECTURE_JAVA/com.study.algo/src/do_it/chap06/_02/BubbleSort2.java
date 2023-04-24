package do_it.chap06._02;

import do_it.Input;

// 버블 환 정렬 -> 교환 횟수에 따른 멈춤
public class BubbleSort2 {
    
    private static final String TITLE = "BUBBLE SORT VOL. 2";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    static void bubbleSort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            // 패스에서의 교환 횟수
            int exchange = 0;
            for (int j = length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    exchange++;
                }
            }
            
            if (exchange == 0) break;
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
