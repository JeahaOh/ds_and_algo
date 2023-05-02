package do_it.chap06._05.EX;

import do_it.Input;

public class InsertionSortPrint {
    private static final String TITLE = "INSERTION SORT PRINT";
    
    static void insertionSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            for (int m = 0; m < length; m++) {
                System.out.printf("%3d ", arr[m]);
            }
            System.out.println();

            int j;
            int tmp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;

            System.out.print(" ".repeat(4 * j));
            System.out.print(i != j ? "^-" : "  ");
            System.out.print("-".repeat(4 * (i - j)));
            System.out.println("+");
            System.out.printf("arr[%d]의 %d를 a[%d]에 삽입.\n\n", i, tmp, j);

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
        insertionSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}
