package nojam.step._04_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 1차원 배열] X보다 작은 수
 * https://www.acmicpc.net/problem/10871
 */
public class _02_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < X) {
                bw.write(num + " ");
            }
        }

        br.close();
        bw.close();
    }
}