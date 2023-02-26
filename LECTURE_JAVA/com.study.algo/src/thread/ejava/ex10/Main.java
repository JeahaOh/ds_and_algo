package thread.ejava.ex10;

/**
 * Demon Thread 는 메인 쓰레드의 보조역할을 수행.
 * 메인 쓰레드가 종료되면 같이 종료된다.
 */
public class Main {
    public static void main(String[] args) {
        DemonThread t = new DemonThread();
        // setDaemon
        t.setDaemon(true);
        t.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        System.out.println("MAIN THREAD END");
    }
}
