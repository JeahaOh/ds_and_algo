package nojam.step._04_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 1차원 배열] 평균
 * https://www.acmicpc.net/problem/1546
 */
public class _10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE;
        double avg = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[n];
        int score;

        for (int i = 0; i < n; i++) {
            score = Integer.parseInt(st.nextToken());
            scores[i] = score;
            max = Math.max(max, score);
        }

        for (int i = 0; i < n; i++) {
            avg += scores[i] / max * 100;
        }

        bw.write(avg / n + "");

        br.close();
        bw.close();
    }
}
