package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 문자열
 * https://www.acmicpc.net/problem/2743
 */
public class _03_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str;

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            bw.write("" + str.charAt(0) + str.charAt(str.length() - 1) + "\n");
        }
        br.close();
        bw.close();
    }
}
