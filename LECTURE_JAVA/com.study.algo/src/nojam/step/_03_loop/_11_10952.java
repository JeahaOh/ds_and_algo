package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] A + B - 5
 * https://www.acmicpc.net/problem/10952
 */
public class _11_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x, y;

        while (true) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0) break;

            bw.write(String.valueOf(x + y));
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
