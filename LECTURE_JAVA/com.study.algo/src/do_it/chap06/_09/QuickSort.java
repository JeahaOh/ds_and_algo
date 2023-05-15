package do_it.chap06._09;

import do_it.Input;

public class QuickSort {
    private static final String TITLE = "QUICK SORT";
    
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }
    
    static void quickSort(int[] arr, int left, int right) {
        int pl = left;                   // 왼쪽 커서
        int pr = right;                  // 오른쪽 커서
        int x = arr[(pl + pr) / 2];        // 피벗(가운데 요소)
    
        do {
            while (arr[pl] < x) pl++;
            while (arr[pr] > x) pr--;
            if (pl <= pr)
                swap(arr, pl++, pr--);
        } while (pl <= pr);
    
        if (left < pr)  quickSort(arr, left, pr);
        if (pl < right) quickSort(arr, pl, right);
    }
    
    public static void main(String[] args) {
        System.out.println(TITLE);
//        int numberOfElement = Input.integer("number of element");
//        int[] arr = new int[numberOfElement];
//
//        for (int i = 0; i < numberOfElement; i++) {
//            arr[i] = Input.integer("x[" + i + "]");
//        }
        int numberOfElement = 9;
        int[] arr = new int[] {5, 8, 4 ,2, 6, 1, 3, 9, 7};
    
        System.out.println("Sort as ASCENDING");
        quickSort(arr, 0, numberOfElement - 1);
        for (int i = 0; i < numberOfElement; i++)
            System.out.println("arr[" + i + "] : " + arr[i]);
    }
}
