package do_it.chap03._04;

import do_it.Input;

import java.util.Scanner;

// 이진 검색
public class BinSearch {
    // 요소수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
    private static int binSearch(int[] a, int n, int key) {
        // 검색 범위의 첫 인덱스
        int pl = 0;
        // 검색 범위의 끝 인덱스
        int pr = n - 1;
        // 검색 범위의 중간 요소 인덱스
        int pc;
        
        do {
            pc = (pl + pr) / 2;
            // 검색 성공
            if (a[pc] == key) return pc;
            // 검색 범위를 뒤쪽 절반으로 좁힘
            else if (a[pc] < key) pl = pc + 1;
            // 검색 범위를 앞쪽 절반으로 좁힘
            else pr = pc - 1;
        } while (pl <= pr);
        
        // 검색 실패
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("num : ");
        int num = sc.nextInt();
        int[] x = new int[num];
        
        System.out.println("input ASCENDING");
        
        x[0] = Input.number("x[0] : ");
        
        for (int i = 1; i < num; i++) {
            do {
                x[i] = Input.number("x[" + i + "] : ");
            } while (x[i] < x[i - 1]);
            // 이전 값보다 작으면 다시 입력 받음
        }
        
        int ky = Input.number("search : ");
        
        // 배열 x에서 값이 ky인 요소 검색
        int idx = binSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("X");
        else
            System.out.println("@" + idx + " : " + x[idx]);
    }
    
}
