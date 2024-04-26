package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] 빠른 A + B
 * https://www.acmicpc.net/problem/15552
 */
public class _06_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
