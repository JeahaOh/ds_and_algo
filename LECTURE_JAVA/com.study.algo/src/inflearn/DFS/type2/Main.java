package inflearn.DFS.type2;

import java.io.*;
import java.util.*;

public class Main {
    private static final int[] dirX = {1, -1, 0, 0};
    private static final int[] dirY = {0, 0, -1, 1};

    private static int T, M, N, K;
    private static boolean[][] graph;
    private static int answer;

    private static void dfs(int y, int x) {
        graph[y][x] = false;

        for (int i = 0; i < 4; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];

            if (newX < 0 || newY < 0) continue;
            if (M < newX || N < newY) continue;

            if (!graph[newY][newX]) continue;
            dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            graph = new boolean[N + 10][M + 10];
            answer = 0;

            int x, y;
            for (int i = 1; i <= K; i++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());

                graph[x + 1][y + 1] = true;
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (!graph[i][j]) continue;
                    answer++;
                    dfs(i, j);
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
