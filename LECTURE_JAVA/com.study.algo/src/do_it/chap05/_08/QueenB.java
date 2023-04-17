package do_it.chap05._08;

/**
 * 각 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열
 * 분기조작 || 가지 뻗기(branching)
 * 분할 정복법(divide and conquer)
 */
public class QueenB {
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
            // 퀸을 j행에 배치
            pos[i] = j;
            
            if (i == 7) {
                // 모든 행에 배치시 출력
                print();
            } else {
                // 다음 열의 퀸을 배치
                set(i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
}
