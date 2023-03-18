package do_it.chap03._04.EX;

import do_it.Input;

/**
 * 연습 3-5
 * 이진 검색 알고리즘으로 검색에 성공했을 때,
 * 그 위치에서 앞쪽으로 하나식 스캔하면서
 * 앞에 있는 여러 요소가 검색 값과 일치하는 경우에,
 * 가장 앞에 위치한 요소의 인덱스를 찾는다.
 */
public class BinSearchX {

    private static int binSearchX(int[] a, int n, int key) {
        // 검색 범위 맨 앞의 인덱스
        int pl = 0;
        // 검색 범위 맨 끝의 인덱스
        int pr = n - 1;

        do {
            // 중앙 요소의 인덱스
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                // key와 같은 맨 앞의 요소 검색
                for (; pc > pl; pc--) {
                    if (a[pc - 1] < key) break;
                }

                // 검색 성공
                return pc;
            } else if (a[pc] < key) {
                // 검색 범위를 앞으로 절반으로 좁힘
                pl = pc + 1;
            } else {
                // 검색 범위를 뒤쪽 절반으로 좁힘
            }
        } while (pl <= pr);

        // 검색 실패
        return -1;
    }
    
    public static void main(String[] args) {
        int num = Input.integer("num");
        int[] x = new int[num];

        System.out.println("ASCENDING");
        x[0] = Input.integer("x[0]");

        for (int i = 1; i < num; i++) {
            do {
                x[i] = Input.integer("x[" + i + "]");
            } while (x[i] < x[i - 1]);
        }

        int ky = Input.integer("search");

        int idx = binSearchX(x, num, ky);

        if (idx == -1)
            System.out.println("X");
        else
            System.out.println("x[" + idx + "]");
    }
}
