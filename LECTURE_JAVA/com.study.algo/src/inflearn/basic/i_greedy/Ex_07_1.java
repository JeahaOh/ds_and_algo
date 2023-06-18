package inflearn.basic.i_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 원더랜드 (최소 스패닝 트리 : 크루스칼, Union & Find)
 * 9 12
 * 1 2 12
 * 1 9 25
 * 2 3 10
 * 2 8 17
 * 2 9 8
 * 3 4 18
 * 3 7 55
 * 4 5 44
 * 5 6 60
 * 5 7 38
 * 7 8 35
 * 8 9 15
 */
public class Ex_07_1 {
    static final class Edge implements Comparable<Edge> {
        public int v1;
        public int v2;
        public int cost;
        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }
    
    static int[] unf;
    
    public static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
    
    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        
        if (fa != fb) unf[fa] = fb;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        List<Edge> arr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) unf[i] = i;
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a, b, c));
        }
        Collections.sort(arr);
        
        int answer = 0;
        for (Edge e : arr) {
            int fv1 = find(e.v1);
            int fv2 = find(e.v2);
            
            if (fv1 != fv2) {
                answer += e.cost;
                union(e.v1, e.v2);
            }
        }
        
        System.out.println(answer);
    }
}
