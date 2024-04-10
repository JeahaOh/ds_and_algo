package thread;

import java.io.*;

/**
 * Created by jeaha on 3/29/24
 */
public class Main {
    public static boolean isPositive(int n) {
        return n >= 0;
    }
    
    public static int detectSpace(int x, int y) {
        if (isPositive(x) && isPositive(y)) {
            return 1;
        } else if (!isPositive(x) && isPositive(y)) {
            return 2;
        } else if (!isPositive(x) && !isPositive(y)) {
            return 3;
        } else {
            return 4;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(detectSpace(x, y)));
        
        br.close();
        bw.close();
    }
}
