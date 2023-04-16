package do_it.chap05._07.EX;

import do_it.Input;

// 하노이의 탑
public class NameOfTowerOfHanoi {
    static String[] name = {"A", "B", "C"};

    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
            
            System.out.println(String.format("[%d]원반을 %s에서 %s로 이동", no, name[x - 1], name[y - 1]));
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
