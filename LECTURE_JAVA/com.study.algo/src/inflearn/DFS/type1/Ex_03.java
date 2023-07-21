package inflearn.DFS.type1;

import do_it.chap03._06.A;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/24479
 * Created by jeaha on 2023/07/31
 */
public class Ex_03 {
    private static int MAX;
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int N, M, R;
    private static int[] answer;
    private static int order;
    
    private static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order++;
        
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (!visited[next])
                dfs(next);
        }
    }
    
    public static void main(String[] args) throws IOException {
        // 입출력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        
        MAX = N + 10;
        graph = new ArrayList[MAX];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;
        
        // graph 연결 정보 채우기
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        // 오름차순 정렬
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        // dfs
        dfs(R);
        
        // 출력 및 종료
        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        
        br.close();
        bw.close();
    }
}
