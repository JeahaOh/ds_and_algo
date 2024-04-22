package nojam.step._03_loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 반복문] 영수증
 * https://www.acmicpc.net/problem/25304
 */
public class _04_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long X = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long sum = 0l;
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long price = Long.parseLong(st.nextToken());
            int qty = Integer.parseInt(st.nextToken());

            sum += price * qty;
        }

        bw.write(sum == X ? "Yes" : "No");

        br.close();
        bw.close();
    }
}
