package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 그대로 출력하기
 * https://www.acmicpc.net/problem/11718
 */
public class _11_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }

        br.close();
        bw.close();
    }
}
