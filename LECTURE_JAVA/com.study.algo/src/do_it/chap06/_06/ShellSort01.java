package do_it.chap06._06;

import do_it.Input;

public class ShellSort01 {
    private static final String TITLE = "SHELL SORT VOL.1";
    
    static void shellSort(int[] arr, int length) {
        for (int h = length / 2; h > 0; h /= 2) {
            for (int idx = h; idx < length; idx++) {
                int j, tmp = arr[idx];
                
                for (j = idx - h; j >= 0 && arr[j] > tmp; j -= h) {
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
