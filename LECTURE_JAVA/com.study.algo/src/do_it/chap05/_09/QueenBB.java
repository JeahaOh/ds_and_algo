package do_it.chap05._09;

/**
 * 각 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열
 * 불필요한 분기를 줄이는 한정 방법(bounding)
 * 분기 + 한정 조작 (branching and bounding)
 * 여기까지는 Eight Rook 문제
 */
public class QueenBB {
    // 각 행에 있는 퀸을 이미 배치했는지 확인
    static boolean[] flag = new boolean[8];
    // 각 열에 있는 퀸의 위치
    static int[] pos = new int[8];
    
    // 각 열에 있는 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%d", pos[i]);
        }
        System.out.println();
    }
    
    // i 열에 퀸을 배치
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            // j 행에 아직 배치하지 않음
            if (flag[j] == false) {
                // 퀸을 j행에 배치
                pos[i] = j;
                
                if (i == 7) {
                    // 모든 행에 배치시 출력
                    print();
                } else {
                    flag[j] = true;
                    // 다음 열의 퀸을 배치
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
}
