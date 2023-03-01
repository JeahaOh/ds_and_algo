package inflearn.basic.d_hash_map_and_tree_set;

import java.util.*;

public class Ex_05 {
    public static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        
        int cnt = 0;
        // System.out.println("treeSet.size : " + treeSet.size());
        // treeSet.remove(143);
        // System.out.println("first : " + treeSet.first());
        // System.out.println("last : " + treeSet.last());
        for (int x : treeSet) {
            //System.out.println(x);
            cnt++;
            if (cnt == k) return x;
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
        
        System.out.println(solution(n, k, arr));
    }
}