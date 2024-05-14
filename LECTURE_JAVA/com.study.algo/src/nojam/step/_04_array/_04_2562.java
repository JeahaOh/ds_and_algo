package nojam.step._04_array;

import java.io.*;

/**
 * [문제 -> 단계 -> 1차원 배열] 최댓값
 * https://www.acmicpc.net/problem/2562
 */
public class _04_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > max) {
                max = n;
                idx = i + 1;
            }
        }

        bw.write(max + "\n" + idx);

        br.close();
        bw.close();
    }
}
