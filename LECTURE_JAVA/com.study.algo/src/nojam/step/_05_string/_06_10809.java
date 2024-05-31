package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 알파벳 찾기
 * https://www.acmicpc.net/problem/10809
 */
public class _06_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            int idx = str.indexOf(i);

            bw.write(idx + " ");
        }

        br.close();
        bw.close();
    }
}
