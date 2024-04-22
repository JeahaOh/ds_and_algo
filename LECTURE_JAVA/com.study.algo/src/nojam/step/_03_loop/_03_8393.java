package nojam.step._03_loop;

import java.io.*;

/**
 * [문제 -> 단계 -> 반복문] 합
 * https://www.acmicpc.net/problem/8393
 */
public class _03_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
