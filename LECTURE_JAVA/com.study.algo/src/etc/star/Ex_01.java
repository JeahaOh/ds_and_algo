package etc.star;

import java.io.*;

/**
 * 백준 별찍기 - 1
 */
public class Ex_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());
        br.close();
    
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write('*');
            }
            if (i != N || i != 1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
