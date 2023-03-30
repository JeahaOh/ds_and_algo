package do_it.chap04._04;

import do_it.Input;

// 실습 4C - 1
// 원하는 개수만큼 값을 계속 입력 받고, 요솟수가 N인 배열에 마지막 N개를 저장.
// 링 버퍼 : 오래된 데이터는 버림
public class LastNElements {
    public static void main(String[] args) {
        // 최대 갯수
        final int N = 10;
        int[] a = new int[N];
        // 입력 받은 갯수
        int cnt = 0;
        int retry;
        
        do {
            a[cnt++ % N] = Input.integer("INTEGER, idx of " + cnt);
            
            retry = Input.integer("RETRY? [1] TRY, [0] EXIT");
        } while(retry == 1);
        
        int i = cnt - N;
        if (i < 0) i = 0;
        
        for (; i < cnt; i++)
            System.out.printf("index of %2d : %d\n", i + 1, a[i % N]);
    }
}
