package nojam.step._06_deepen_1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 심화 1] 킹, 퀸, 록, 비숏, 나이트, 폰
 * https://www.acmicpc.net/problem/3003
 */
public class _02_3003 {
    private static final int[] correct = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answer = new int[6];
        int input;

        for (int i = 0; i < 6; i++) {
            input = Integer.parseInt(st.nextToken());
            answer[i] = correct[i] - input;
        }

        for (int n : answer) bw.write(n + " ");

        br.close();
        bw.close();
    }
}
