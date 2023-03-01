package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기
 * BFS : 상태트리탐색
 * 최단거리 찾기에 사용됨.
 */
public class Ex_08 {
    // dist : 이동 가능 거리
    static int[] dist = {1, -1, 5};
    static int[] check;
    static Queue<Integer> q = new LinkedList<>();
    
    public static int bfs(int startPoint, int endPoint) {
        check = new int[10001];
        check[startPoint] = 1;
        q.offer(startPoint);
        int depth = 0;
        
        while (!q.isEmpty()) {
            int length = q.size();
            for (int i = 0; i < length; i++) {
                int x = q.poll();
                
                if (x == endPoint) return depth;
                
                for (int j = 0; j < 3; j++) {
                    int next = x + dist[j];
                    
                    // 목표 지점을 발견하면 깊이 + 1을 return.
                    if (next == endPoint) return depth + 1;
                    
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        q.offer(next);
                    }
                }
            }
            depth++;
        }
        
        return depth;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startPoint = sc.nextInt();
        int endPoint = sc.nextInt();
        System.out.println(bfs(startPoint, endPoint));
    }
}