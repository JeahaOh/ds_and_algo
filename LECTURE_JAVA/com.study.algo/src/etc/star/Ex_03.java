package etc.star;

import java.io.*;

/**
 * 백준 별찍기 - 3
 */
public class Ex_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        for (int line = 1; line <= N; line++) {
            for (int stars = N; stars >= line; stars--) {
                bw.write("*");
            }
            bw.newLine();
        }
    
        bw.flush();
        bw.close();
    }
}
