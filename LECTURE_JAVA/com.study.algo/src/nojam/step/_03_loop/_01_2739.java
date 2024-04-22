package nojam.step._03_loop;

import java.io.*;

/**
 * [문제 -> 단계 -> 반복문] 주사위 구구단
 * https://www.acmicpc.net/problem/2739
 */
public class _01_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(makeString(n, i));
        }

        bw.write(sb.toString());


        br.close();
        bw.close();
    }

    public static String makeString(int n, int i) {
        return String.format("%d * %d = %d\n", n, i, n * i);
    }
}
