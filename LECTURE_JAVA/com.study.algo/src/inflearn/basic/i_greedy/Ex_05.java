package inflearn.basic.i_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 다익스트라 알고리즘 Dijkstra
 * 더럽게 어렵다
 *
 * 6 9
 * 1 2 12
 * 1 3 4
 * 2 1 2
 * 2 3 5
 * 2 5 5
 * 3 4 5
 * 4 2 2
 * 4 5 5
 * 6 4 5
 */
public class Ex_05 {
    static final class Edge implements Comparable<Edge> {
        public int vex;
        public int cost;
        Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }
    
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    
    public void solution(int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v, 0));
        dis[v] = 0;
        
        while (!pq.isEmpty()) {
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            
            if (nowCost > dis[now]) continue;
            
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Ex_05 t = new Ex_05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        
        t.solution(1);
        
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(String.format("%d : %d", i, dis[i]));
            else System.out.println(i + " : impossible");
        }
    }
}
