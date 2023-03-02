package do_it.chap02._04.EX;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2 {
    private static int maxOf(int[] a) {
        int max = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(20);
        System.out.println("N : " + num);
        
        int [] intArr = new int[num];
        
        for (int i = 0; i < num; i++) {
            intArr[i] = rand.nextInt(90);
            System.out.println(i + " : " + intArr[i]);
        }
        
        System.out.println("MAX : " + maxOf(intArr));
    }
}