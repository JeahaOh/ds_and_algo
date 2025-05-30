package nojam.step._05_string;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 문자열] 상수
 * https://www.acmicpc.net/problem/2908
 */
public class _09_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {
            max = Math.max(max, Integer.parseInt(sb.append(st.nextToken()).reverse().toString()));
            sb.delete(0, sb.length());
        }

        bw.write(max + "");

        br.close();
        bw.close();
    }
}
