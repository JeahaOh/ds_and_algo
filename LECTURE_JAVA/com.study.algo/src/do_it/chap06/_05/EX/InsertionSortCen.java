package do_it.chap06._05.EX;

import do_it.Input;

// 삽입정렬 + 보초법
public class InsertionSortCen {
    private static final String TITLE = "INSERTION SORT 보초법";
    
    static void insertionSort(int[] arr, int length) {
        for (int i = 2; i < length; i++) {
            int tmp = arr[0] = arr[i];
            int j = i;
            for ( ; arr[j - 1] > tmp; j--) {
                arr[j] = arr[j - 1];
            }
            if (j > 0) arr[j] = tmp;
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
