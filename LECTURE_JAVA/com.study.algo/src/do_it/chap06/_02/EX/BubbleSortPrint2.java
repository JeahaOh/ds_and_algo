package do_it.chap06._02.EX;

import do_it.Input;

// 단순 교환 정렬 교환 과정 출력
public class BubbleSortPrint2 {
    
    private static final String TITLE = "BUBBLE SORT VOL. 2";
    
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

        for (int i = 0; i < length - 1; i++) {
            // 패스에서의 교환 횟수
            int exchange = 0;
            System.out.printf("PATH : %d\n", i + 1);

            for (int j = length - 1; j > i; j--) {
                for (int m = 0; m < length - 1; m++) {
                  System.out.printf(
                      "%3d %c"
                      , arr[m]
                      , (m != j - 1)
                          ? ' '
                          : (arr[j - 1] > arr[j]
                              ? '+'
                              : '-')
                  );
                }
                System.out.printf("%3d\n", arr[length - 1]);

                ccnt++;

                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    exchange++;
                    scnt++;
                }
            }
            

            for (int m = 0; m < length; m++) {
              System.out.printf("%3d  ", arr[m]);
            }
            System.out.println();
            if (exchange == 0) break;
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
