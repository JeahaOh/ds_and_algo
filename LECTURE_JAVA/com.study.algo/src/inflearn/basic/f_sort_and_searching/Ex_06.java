package inflearn.basic.f_sort_and_searching;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_06 {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int [] temp = arr.clone();
        Arrays.sort(temp);
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) answer.add(i + 1);
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}