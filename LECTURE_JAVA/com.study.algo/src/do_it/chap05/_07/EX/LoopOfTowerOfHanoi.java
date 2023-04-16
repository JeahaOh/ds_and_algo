package do_it.chap05._07.EX;

import do_it.Input;

// 하노이의 탑 반복문
public class LoopOfTowerOfHanoi {
    static String[] name = {"A", "B", "C"};

    static void move(int no, int x, int y) {
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];
        int ptr = 0;
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;

                ptr++;
                no -= 1;
                y = 6 - x - y;

                continue;
            }

            System.out.println(String.format("[%d]원반을 %s에서 %s로 이동", no, name[x - 1], name[y - 1]));

            if (sw == 1 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;

                ptr++;
                no -= 1;
                x = 6 - x - y;

                if (++sw == 2) sw = 0;

                continue;
            }
            
            do {
                if (ptr-- == 0) {
                    // 스택이 비어 있으면
                    return;
                }

                x = xstk[ptr];
                y = ystk[ptr];
                sw = sstk[ptr] + 1;
                no++;
            } while (sw == 2);
        }
    }
    
    public static void main(String[] args) {
        int stoneCount = Input.integer("STONE COUNT");
        
        // X에서 Y로 count 개의 원반을 옮김
        move(stoneCount, 1, 3);
    }
}
