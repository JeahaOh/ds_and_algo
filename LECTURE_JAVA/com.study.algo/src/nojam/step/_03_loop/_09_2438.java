package nojam.step._03_loop;

import java.io.*;

/**
 * [문제 -> 단계 -> 반복문] 별 찍기 - 1
 * https://www.acmicpc.net/problem/2438
 */
public class _09_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
