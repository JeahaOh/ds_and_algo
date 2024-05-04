package nojam.step._04_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 1차원 배열] 최소, 최대
 * https://www.acmicpc.net/problem/10818
 */
public class _03_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            max = Long.max(max, num);
            min = Long.min(min, num);
        }

        bw.write(min + " " + max);

        br.close();
        bw.close();
    }
}
