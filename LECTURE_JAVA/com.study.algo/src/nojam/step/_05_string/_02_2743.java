package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 단어 길이 제기
 * https://www.acmicpc.net/problem/2743
 */
public class _02_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine().length() + "");

        br.close();
        bw.close();
    }
}
