package do_it.chap03._05.EX;

public class Id {
    // 클래스 변수
    private static int counter = 0;
    // 인스턴스 변수
    private int id;
    
    // 생성자
    public Id() {
        id = ++counter;
    }
    
    // 클래스 메소드
    public static int getCounter() {
        return counter;
    }
    
    // 인스턴스 메소드
    public int getId() {
        return id;
    }
}
