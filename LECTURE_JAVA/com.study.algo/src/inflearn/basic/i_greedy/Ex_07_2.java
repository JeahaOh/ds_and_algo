package inflearn.basic.i_greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 원더랜드 (최소 스패닝 트리 : 프림, Priority Queue)
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
public class Ex_07_2 {
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        
        int answer = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1, 0));
        
        while (!pq.isEmpty()) {
            Edge temp = pq.poll();
            int ev = temp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += temp.cost;
                for (Edge ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pq.offer(new Edge(ob.vex, ob.cost));
                }
            }
        }
        
        System.out.println(answer);
    }
}
