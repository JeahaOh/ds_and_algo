package etc.star;

import java.io.*;

/**
 * 백준 별찍기 - 2
 */
class Ex_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        for (int line = 1; line <= N; line++) {
            for (int spaces = N - 1; spaces >= line; spaces--) {
                bw.write(" ");
            }
            for (int stars = 1; stars <= line; stars++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
