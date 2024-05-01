package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] 별 찍기 - A + B - 4
 * https://www.acmicpc.net/problem/10951
 */
public class _12_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringTokenizer st;
        int x, y;

        while (true) {
            str = br.readLine();
            if (str == null || str.isEmpty()) break;

            st = new StringTokenizer(str);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(x + y));
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
