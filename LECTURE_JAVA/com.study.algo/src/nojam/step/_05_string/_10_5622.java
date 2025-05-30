package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 다이얼
 * https://www.acmicpc.net/problem/5622
 */
public class _10_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] times = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int waste = 0;

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {

            int idx = (int) str.charAt(i) - 65;
            waste += times[idx];
        }

        bw.write(waste + "");

        br.close();
        bw.close();
    }
}
