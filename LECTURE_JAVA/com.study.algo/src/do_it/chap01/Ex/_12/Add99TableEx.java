package do_it.chap01.Ex._12;

// 연습 1-12
// 구구단 덧셈표 출력
public class Add99TableEx {
    public static void main(String[] args) {
        System.out.print("   |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        
        System.out.println("\n---+---------------------------");
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i + j);
            
            System.out.println();
        }
    }
}
