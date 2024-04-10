package com.example.nojam._9498;

import java.io.*;

/**
 * Created by jeaha on 3/29/24
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int year = Integer.parseInt(br.readLine());
        
        if (isLeapYear(year)) bw.write("1");
        else bw.write("0");
        
        
        br.close();
        bw.close();
    }
    
    public static boolean isLeapYear(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}