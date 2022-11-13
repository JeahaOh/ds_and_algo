package etc.star;

import java.io.*;

/**
 * 백준 별찍기 - 4
 */
public class Ex_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        for (int line = 1; line <= N; line++) {
            System.out.print(line + " ");
            for (int stars = line - 1; stars < N; stars++) {
                bw.write("*");
                //System.out.print(stars);
            }
            System.out.println();
            bw.newLine();
        }
        
        
        bw.flush();
        bw.close();
    }
}
