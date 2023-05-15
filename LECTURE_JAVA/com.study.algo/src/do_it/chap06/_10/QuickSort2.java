package do_it.chap06._10;


import do_it.chap04._01.IntStack;

public class QuickSort2 {
    private static final String TITLE = "QUICK SORT NOT RECURSIVE";
    
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }
    
    static void quickSort(int[] arr, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);
        
        lstack.push(left);
        rstack.push(right);
        
        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = arr[(left + right) / 2];
            
            do {
                while (arr[pl] < x) pl++;
                while (arr[pr] > x) pr--;
                
                if (pl <= pr) swap(arr, pl++, pr--);
            } while (pl <= pr);
            
            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            
            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    
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
