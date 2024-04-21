package nojam.step._02_condition;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 조건문] 주사위 세개
 * https://www.acmicpc.net/problem/2480
 */
public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // bw.write(String.format("%d, %d, %d%n", a, b, c));
        int result;

        if (a == b && b == c) {
            result = 10_000 + a * 1_000;
        } else if (a == b || b == c || a == c) {
            result = 1_000 + ((a == b) ? a : ((b == c) ? b : c )) * 100;
        } else {
            result = Math.max(Math.max(a, b), c) * 100;
        }

        bw.write(String.format("result : %d%n", result));

        br.close();
        bw.close();
    }
}
