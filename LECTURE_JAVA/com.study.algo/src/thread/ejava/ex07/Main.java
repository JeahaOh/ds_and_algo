package thread.ejava.ex07;

/**
 * 동기화 메소드와 동기화 블록
 * 동기화 블록으로 동기화 처리
 */
public class Main {
    public static void main(String[] args) {
        Cal cal = new Cal();
        
        User1 u1 = new User1();
        u1.setCal(cal);
        u1.start();
        
        User2 u2 = new User2();
        u2.setCal(cal);
        u2.start();
    }
}
