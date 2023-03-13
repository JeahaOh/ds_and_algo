package do_it.chap03._05;

import do_it.Input;

import java.util.Arrays;

//  Array.binarySearch로 이진 탐색
public class BinarySearchTester {
    public static void main(String[] args) {
        
        int num = Input.number("num");
        int[] x = new int[num];
        
        System.out.println("ASC");
        x[0] = Input.number("x[0]");
        
        for (int i = 1; i < num; i++) {
            do {
                x[i] = Input.number("x[" + i + "]");
            } while (x[i] < x[i - 1]);
        }
        
        int ky = Input.number("search");
        
        int idx = Arrays.binarySearch(x, ky);
        
        if (idx < 0) {
            int insPoint = -idx - 1;
            System.out.println("X, insert point : " + insPoint);
        } else
            System.out.println("x[" + idx + "]");
        
    }
}
