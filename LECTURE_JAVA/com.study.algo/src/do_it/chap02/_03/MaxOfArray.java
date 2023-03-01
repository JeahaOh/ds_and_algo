package do_it.chap02._03;

import java.util.Scanner;

public class MaxOfArray {
    private static int maxOf(int[] a) {
        int max = a[0];
        
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int num = sc.nextInt();
        
        int [] intArr = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print(i + " : ");
            intArr[i] = sc.nextInt();
        }
        
        System.out.println("MAX : " + maxOf(intArr));
    }
}
