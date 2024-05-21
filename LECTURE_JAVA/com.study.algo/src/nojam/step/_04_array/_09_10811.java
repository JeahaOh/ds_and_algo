package nojam.step._04_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 1차원 배열] 바구니 뒤집기
 * https://www.acmicpc.net/problem/10811
 */
public class _09_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;

        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            if (i == j) continue;
            while (i < j) {
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
                i++;
                j--;
            }
        }

        for (int num : arr) bw.write(num + " ");

        br.close();
        bw.close();
    }
}