package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] A + B - 8
 * https://www.acmicpc.net/problem/11022
 */
public class _08_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int i = 0;
        while(++i <= n) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(x).append(" + ").append(y).append(" = ").append(x + y).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}