package nojam.step._04_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 1차원 배열] 공 넣기
 * https://www.acmicpc.net/problem/10810
 */
public class _05_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];

        for (int x = 0; x < m; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int k = Integer.parseInt(st.nextToken());

            for (int y = i; y <= j; y++) {
                nums[y] = k;
            }
        }

        for (int num : nums) {
            bw.write(num + " ");
        }

        br.close();
        bw.close();
    }
}
