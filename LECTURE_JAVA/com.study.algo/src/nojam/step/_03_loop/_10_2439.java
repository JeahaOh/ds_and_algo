package nojam.step._03_loop;

import java.io.*;

/**
 * [문제 -> 단계 -> 반복문] 별 찍기 - 2
 * https://www.acmicpc.net/problem/2439
 */
public class _10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                bw.write(" ");
            }

            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
