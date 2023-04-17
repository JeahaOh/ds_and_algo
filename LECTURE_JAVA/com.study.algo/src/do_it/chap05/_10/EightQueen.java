package do_it.chap05._10;

// 8 퀸 문제
// memoization? divide ans conquer?
public class EightQueen {
    // 각 행에 있는 퀸을 이미 배치했는지 확인
    static boolean[] flag_row = new boolean[8];
    // / 대각 방향 위으로 퀸을 배치했는지 확인
    static boolean[] flag_left_upper = new boolean[15];
    // \ 대각 방향 위으로 퀸을 배치했는지 확인
    static boolean[] flag_right_upper = new boolean[15];
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
        boolean isRowSettable, isLeftSettable, isRightSettable;
        for (int j = 0; j < 8; j++) {
            // j 행 배치 여부
            isRowSettable = flag_row[j] == false;
            // / 대각선 위에 아직 배치하지 않음
            isLeftSettable = flag_left_upper[i + 7] == false;
            // \ 대각선 위에 아직 배치하지 않음
            isRightSettable = flag_right_upper[i - j + 7] == false;
            
            if (isRowSettable && isLeftSettable && isRightSettable) {
                // 퀸을 j행에 배치
                pos[i] = j;
                
                if (i == 7) {
                    // 모든 행에 배치시 출력
                    print();
                } else {
                    flag_row[j] = flag_left_upper[i + j] = flag_right_upper[i - j + 7] = true;
                    // 다음 열의 퀸을 배치
                    set(i + 1);
                    flag_row[j] = flag_left_upper[i + j] = flag_right_upper[i - j + 7] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
}
