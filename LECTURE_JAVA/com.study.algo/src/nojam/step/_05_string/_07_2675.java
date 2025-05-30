package nojam.step._05_string;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 문자열] 문자열 반복
 * https://www.acmicpc.net/problem/2675
 */
public class _07_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < x; k++) {
                    bw.write(str.charAt(j));
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
