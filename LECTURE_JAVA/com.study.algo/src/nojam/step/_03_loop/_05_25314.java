package nojam.step._03_loop;

import java.io.*;

/**
 * [문제 -> 단계 -> 반복문] 코딩은 체육과목 입니다
 * https://www.acmicpc.net/problem/25314
 */
public class _05_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = (Integer.parseInt(br.readLine()));
        if (n % 4 > 0) {
            n = (n / 4) + 1;
        } else {
            n /= 4;
        }

        bw.write("long ".repeat(n) + "int");

        br.close();
        bw.close();
    }
}
