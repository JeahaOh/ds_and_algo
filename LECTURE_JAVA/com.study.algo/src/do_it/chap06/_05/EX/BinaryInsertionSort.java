package do_it.chap06._05.EX;

import do_it.Input;

public class BinaryInsertionSort {
    private static final String TITLE = "BINARY INSERTION SORT";
    
    static void binaryInsertionSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int left = 0;
            int right = i - 1;
            int center;
            int target;

            do {
                center = (left + right) / 2;
                if (arr[center] == key) {
                    // 검색 성공
                    break;
                } else if (arr[center] < key) {
                    left = center + 1;
                } else {
                    right = center - 1;
                }
            } while (left <= right);

            target = (left <= right) ? center + 1 : right + 1;

            for (int j = i; j > target; j--) {
                arr[j] = arr[j - 1];
            }
            arr[target] = key;
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
        binaryInsertionSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}
