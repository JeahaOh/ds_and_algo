package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] A + B - 3
 * https://www.acmicpc.net/problem/10950
 */
public class _02_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            bw.write(String.format("%d\n", Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }

        br.close();
        bw.close();
    }
}
