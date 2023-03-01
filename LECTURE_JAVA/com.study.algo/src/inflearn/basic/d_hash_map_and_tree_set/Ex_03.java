package inflearn.basic.d_hash_map_and_tree_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Ex_03 {
    public static List<Integer> solution(int n, int k, int[] arr) {
        int left = 0, right = k - 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for (; right < n; right++, left++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            answer.add(map.size());
            
            map.put(arr[left], map.get(arr[left]) - 1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        
        for (int x : solution(n, k, arr)) System.out.print(x + " ");
    }
}