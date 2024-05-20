package nojam.step._04_array;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * [문제 -> 단계 -> 1차원 배열] 나머지
 * https://www.acmicpc.net/problem/3052
 */
public class _08_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        bw.write(set.size() + "");

        br.close();
        bw.close();
    }
}
