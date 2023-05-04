package do_it.chap06._07;

import do_it.Input;

public class ShellSort02 {
    private static final String TITLE = "SHELL SORT VOL.2";
    
    static void shellSort(int[] arr, int length) {
        int h;
        for (h = 1; h < length; h = h * 3 + 1);
        
        for (; h > 0; h /= 3) {
            for (int idx = h; idx < length; idx++) {
                int j;
                int tmp = arr[idx];
                
                for (j = idx - h; j >= 0 && arr[j] > tmp; j-= h) {
                    arr[j + h] = arr[j];
                }
                arr[j + h] = tmp;
            }
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
        shellSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
    }
}
