package nojam.step._02_condition;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 조건문] 오븐 시계
 * https://www.acmicpc.net/problem/2525
 */
public class _2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nowTime = br.readLine();
        StringTokenizer st = new StringTokenizer(nowTime);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        //bw.write(String.format("%d %d %d%n", a, b, c));

        // 분으로 계산하여 합을 구한 뒤 시간을 환산한다.
        int m = b + (a * 60) + c;
        int h = m / 60;
        m = m % 60;

        if (h >= 24) {
            h -= 24;
        }

        bw.write(String.format("%d %d%n", h, m));

        br.close();
        bw.close();
    }
}
