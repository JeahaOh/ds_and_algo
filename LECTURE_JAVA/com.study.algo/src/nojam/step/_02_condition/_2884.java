import java.io.*;
import java.util.StringTokenizer;

/**
 * [문제 -> 단계 -> 조건문] 알람 시계
 * https://www.acmicpc.net/problem/2884
 */
public class _2884 {

    public static final int MM = 45;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= MM) {
            m -= MM;
        } else {
            m = 60 + (m - MM);
            h -= 1;
            if (h < 0) h = 23;
        }

        bw.write(String.valueOf(h) + " " + String.valueOf(m) + "\n");

        br.close();
        bw.close();
    }
}
