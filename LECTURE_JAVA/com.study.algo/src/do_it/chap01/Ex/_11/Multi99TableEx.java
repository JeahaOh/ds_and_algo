package do_it.chap01.Ex._11;

// 연습 1-11
// 구구단 표를 출력(곱하는 수를 출력)
public class Multi99TableEx {
    public static void main(String[] args) {
        System.out.println("   |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        
        System.out.println("\n---+---------------------------");
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d | ", i);
            
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            
            System.out.println();
        }
    }
}
