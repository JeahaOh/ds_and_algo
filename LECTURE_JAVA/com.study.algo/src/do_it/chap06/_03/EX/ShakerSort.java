package do_it.chap06._03.EX;

import do_it.Input;

/**
 * 버블정렬을 개선한 알고리즘.
 * 패스의 스캔 방향을 교대로 바꾸면 적은 횟수로 비교 가능.
 * 양방향 버블 정렬(bidirection bubble sort
 * 또는 cocktail sort, shaker sort라고 함
 */
public class ShakerSort {
    
    private static final String TITLE = "SHAKER SORT";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }

    static void shakerSort(int[] arr, int length) {
      int left = 0;
      int right = length - 1;
      int last = right;

      while (left < right) {
        for (int j = right; j > left; j--) {
          if (arr[j - 1] > arr[j]) {
            swap(arr, j - 1, j);
            last = j;
          }
        }
        left = last;

        for (int j = left; j < right; j++) {
          if (arr[j] > arr[j + 1]) {
            swap(arr, j, j + 1);
            last = j;
          }
        }
        right = last;
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
        shakerSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}
