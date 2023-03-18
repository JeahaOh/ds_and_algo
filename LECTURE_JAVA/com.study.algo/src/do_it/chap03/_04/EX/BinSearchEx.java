package do_it.chap03._04.EX;

import do_it.Input;

/**
 * 연습 3-4
 * 이진 검색 (검색 과정을 자세히 출력)
 * 각 행의 맨 왼쪽에 현재 선택한 요소의 인텍스를 출력,
 * 검색 범위의 첫 요소 위에 <-, 끝 요소에 ->, 현재 선택한 중앙 요소 위에 + 출력
 */
public class BinSearchEx {
    private static int binSearch(int[] a, int n, int key) {
        System.out.print("   |");
        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();
        
        System.out.print("---+");
        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();
        
        // 검색 범위 맨앞의 인덱스
        int pl = 0;
        // 검색 범위 맨끝의 인덱스
        int pr = n - 1;
        // 중앙요소의 인덱스
        int pc;
        
        do {
            pc = (pl + pr) / 2;
            System.out.print("   |");
            if (pl != pc)
                System.out.printf(String.format("%%%ds<-%%%ds+",
                                (pl * 4) + 1, (pc - pl) * 4),
                        "", "");
            else
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            if (pc != pr)
                System.out.printf(String.format("%%%ds->\n",
                        (pr - pc) * 4 - 2), "");
            else
                System.out.println("->");
            System.out.printf("%3d|", pc);
            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");
            if (a[pc] == key)
                // 검색 성공
                return pc;
            else if (a[pc] < key)
                // 검색 범위를 뒤쪽 절반으로 좁힘
                pl = pc + 1;
            else
                // 검색 범위를 앞쪽 절반으로 좁힘
                pr = pc - 1;
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

        int idx = binSearch(x, num, ky);

        if (idx == -1)
            System.out.println("X");
        else
            System.out.println("x[" + idx + "]");
    }
}
