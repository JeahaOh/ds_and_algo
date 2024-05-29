package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 아스키 코드
 * https://www.acmicpc.net/problem/11654
 */
public class _04_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = br.readLine().charAt(0);
        bw.write("" + (int) c);

        br.close();
        bw.close();
    }
}
