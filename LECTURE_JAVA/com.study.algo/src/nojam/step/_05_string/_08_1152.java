package nojam.step._05_string;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 문자열] 단어의 개수
 * https://www.acmicpc.net/problem/1152
 */
public class _08_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("" + (new StringTokenizer(br.readLine())).countTokens());

        br.close();
        bw.close();
    }
}
