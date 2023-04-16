package do_it.chap05._07;

import do_it.Input;

// 하노이의 탑
public class TowerOfHanoi {
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
            
            System.out.printf("[%d] @%d -> %d\n", no, x, y);
        }
        
        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }
    
    public static void main(String[] args) {
        int stoneCount = Input.integer("STONE COUNT");
        
        // X에서 Y로 count 개의 원반을 옮김
        move(stoneCount, 1, 3);
    }
}
