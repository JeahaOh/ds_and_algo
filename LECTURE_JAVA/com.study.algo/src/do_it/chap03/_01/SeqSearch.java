package do_it.chap03._01;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {
    // 요소 수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    private static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        
        while (true) {
            // 검색 실패, -1 반환
            if (i == n) return -1;
            
            // 검색 성공, 인덱스 반환
            if (a[i] == key) return i;
            
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("num : ");
        int num = sc.nextInt();
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        
        System.out.print("search : ");
        int ky = sc.nextInt();
        
        // 배열 x에서 값이 ky인 요소 검색
        int idx = seqSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("X");
        else
            System.out.println("@" + idx + " : " + x[idx]);
    }
}
