package do_it.chap06._06.EX;

import do_it.Input;

public class ShellSort01Count {
    private static final String TITLE = "SHELL SORT VOL.1 - count";
    
    static int shellSort(int[] arr, int length) {
        int count = 0;

        for (int h = length / 2; h > 0; h /= 2) {
            for (int idx = h; idx < length; idx++) {
                int j, tmp = arr[idx];
                
                for (j = idx - h; j >= 0 && arr[j] > tmp; j -= h) {
                    arr[j + h] = arr[j];
                    count++;
                }
                
                arr[j + h] = tmp;
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(TITLE);
        int numberOfElement = Input.integer("number of element");
        int[] arr = new int[numberOfElement];
        
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = Input.integer("x[" + i + "]");
        }
        
        System.out.println("Sort as ASCENDING");
        int count = shellSort(arr, numberOfElement);
        
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);
        }
        System.out.println("END WITH COUNT " + count);
    }
}
