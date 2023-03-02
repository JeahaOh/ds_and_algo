package do_it.chap02._05.EX._04;

import java.util.Arrays;
import java.util.Random;

public class Copy {
    private static void copy(int[] origin, int[] clone) {
        for (int i = 0; i < origin.length; i++) {
            clone[i] = origin[i];
        }
    
        System.out.println("CLONE : " + Arrays.toString(clone));
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num;
        do {
            num = rand.nextInt(10);
        } while (2 >= num && num <=10);
        System.out.println("N : " + num);
        
        int[] origin = new int[num];
        int[] clone = new int[num];
        
        for (int i = 0; i < num; i++) {
            origin[i] = rand.nextInt(20);
        }
        
        System.out.println("origin : " + Arrays.toString(origin));
        System.out.println("clone : " + Arrays.toString(clone));
        copy(origin, clone);
    }
}
