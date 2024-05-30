package nojam.step._05_string;

import java.io.*;

/**
 * [문제 -> 단계 -> 문자열] 숫자의 합
 * https://www.acmicpc.net/problem/11654
 */
public class _05_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < l; i ++) {
            sum += (int) str.charAt(i) - 48;
        }

        bw.write("" + sum);

        br.close();
        bw.close();
    }
}
