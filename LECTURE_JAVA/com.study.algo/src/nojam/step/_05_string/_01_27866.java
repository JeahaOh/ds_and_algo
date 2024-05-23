package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 문자와 문자열
 * https://www.acmicpc.net/problem/27866
 */
public class _01_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine().charAt(Integer.parseInt(br.readLine()) - 1) + "");

        br.close();
        bw.close();
    }
}
