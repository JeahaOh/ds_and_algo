package do_it.chap06._09.EX;

public class QuickSortPrint {
    private static final String TITLE = "QUICK SORT PRINT";
    
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }
    
    static void quickSort(int[] arr, int left, int right) {
        int pl = left;                   // 왼쪽 커서
        int pr = right;                  // 오른쪽 커서
        int x = arr[(pl + pr) / 2];        // 피벗(가운데 요소)

        System.out.printf("a[%d]～a[%d] : {", left, right);
        for (int i = left; i < right; i++)
            System.out.printf("%d , ", arr[i]);
        System.out.printf("%d}\n", arr[right]);

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
        
        int numberOfElement = 9;
        int[] arr = new int[] {5, 8, 4 ,2, 6, 1, 3, 9, 7};
        
        System.out.println("Sort as ASCENDING");
        quickSort(arr, 0, numberOfElement - 1);
        for (int i = 0; i < numberOfElement; i++)
            System.out.println("arr[" + i + "] : " + arr[i]);
    }
}
