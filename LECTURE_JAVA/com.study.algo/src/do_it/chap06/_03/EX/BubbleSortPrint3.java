package do_it.chap06._03.EX;

import do_it.Input;

public class BubbleSortPrint3 {
    
    private static final String TITLE = "BUBBLE SORT VOL. 3";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }
    
    static void bubbleSort(int[] arr, int length) {
        // 비교 횟수
        int ccnt = 0;
        // 교환 횟수
        int scnt = 0;

        int i = 0;
        int k = 0;

        while (k < length - 1) {
          System.out.printf("PATH %d : \n", ++i);
          // 마지막 요소를 교환한 위치
          int last = length - 1;

          for (int j  = length - 1; j > k; j--) {
            for (int m = 0; m < length - 1; m++) {
              System.out.printf("%3d %c"
                                , arr[m]
                                , (m != j - 1)
                                  ? ' '
                                  : (arr[j - 1] > arr[j])
                                    ? '+'
                                    : '-'
              );
            }
            System.out.printf("%3d\n", arr[length - 1]);
            ccnt++;

            if (arr[j - 1] > arr[j]) {
              swap(arr, j - 1, j);
              last = j;
              scnt++;
            }
          }

          k = last;
        }

        System.out.printf("Compare Count : %d\nChange Count : %d\n", ccnt, scnt);
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
