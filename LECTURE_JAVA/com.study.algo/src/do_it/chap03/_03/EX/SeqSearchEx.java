package do_it.chap03._03.EX;

import do_it.Input;

// 연습 3-2
// 선형검색 (검색 과정을 출력)

class SeqSearchEx {
    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형 검색(보초법)
    private static int seqSearchEx(int[] a, int n, int key) {
        System.out.print("   |");
        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();
        
        System.out.print("---+");
        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");
            if (a[i] == key)
                return i;
        }
        return -1;
    }
    
    private static void printBar(int n) {
        System.out.print("----");
        for (int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int num = Input.number("num");
        // 요소가 num + 1
        int[] x = new int[num + 1];
        
        for (int i = 0; i < num; i++) {
            x[i] = Input.number("x[" + i + "]");
        }
        
        int ky = Input.number("search");
        printBar(num);
        
        // 배열 x에서 값이 ky인 요소 검색
        int idx = seqSearchEx(x, num, ky);
        
        printBar(num);
        if (idx == -1)
            System.out.println("X");
        else
            System.out.println(x[idx] + " @x[" + idx + "]");
    }
}