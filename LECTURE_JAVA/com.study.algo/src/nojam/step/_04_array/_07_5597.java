package nojam.step._04_array;

import java.io.*;

/**
 * [문제 -> 단계 -> 1차원 배열] 과제 안 내신분..?
 * https://www.acmicpc.net/problem/5597
 */
public class _07_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] students = new boolean[31];

        for (int i = 0; i < 28; i++) {
            students[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i < 31; i++) {
            if (!students[i]) {
                bw.write(i + "\n");
            }
        }

        br.close();
        bw.close();
    }
}
