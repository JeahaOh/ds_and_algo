package do_it.chap06._04.EX;

import do_it.Input;

public class SelectionSortPrint {
    private static final String TITLE = "SELECTION SORT PRINT";
    
    static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] ^= arr[idx2];
        arr[idx2] ^= arr[idx1];
        arr[idx1] ^= arr[idx2];
    }

    static void selectionSort(int[] arr, int length) {
      for (int i = 0; i < length - 1; i++) {
        int min = i;
        for (int j = i + 1; j < length; j++) {
          if (arr[j] < arr[min]) {
            min = j;
          }
        }

        for (int m = 0; m < length; m++) {
          System.out.print((m == i)
                            ? "  * "
                            : (m == min)
                              ? "  + "
                              : "    ");
        }
        System.out.println();

        for (int m = 0; m < length; m++) {
          System.out.printf("%3d ", arr[m]);
        }
        System.out.println("");

        swap(arr, i, min);
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
        selectionSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}