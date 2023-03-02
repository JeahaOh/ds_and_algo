package do_it.chap02._05.EX._03;

import java.util.Arrays;
import java.util.Random;

public class SumOf {
    private static int sumOf(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        
        return sum;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
    
        int num;
        do {
            num = rand.nextInt(10);
        } while (2 >= num && num <=10);
        System.out.println("N : " + num);
    
        int[] x = new int[num];
    
        for (int i = 0; i < num; i++) {
            x[i] = rand.nextInt(20);
        }
    
        System.out.println(Arrays.toString(x));
        System.out.println("SUM OF x : " + sumOf(x));
    }
}
