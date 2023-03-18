package do_it.chap03._03.EX;

import do_it.Input;

/**
 * 선형 검색 보초법
 * if 문의 판단 횟수가 줄었음.
 * while -> for
 */
public class SeqSearchSenFor {
    // 요소 수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    private static int seqSearch(int[] a, int n, int key) {
        // 보초
        a[n] = key;
        int i;
        for (i = 0; a[i] != key; i++);
    
        return i == n ? - 1 : i;
    }
    
    public static void main(String[] args) {
        int num = Input.integer("num : ");
        // 요소가 num + 1
        int[] x = new int[num + 1];
        
        for (int i = 0; i < num; i++) {
            x[i] = Input.integer("x[" + i + "] : ");
        }
        
        int ky = Input.integer("search : ");
        
        // 배열 x에서 값이 ky인 요소 검색
        int idx = seqSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("X");
        else
            System.out.println("@" + idx + " : " + x[idx]);
    }
}
