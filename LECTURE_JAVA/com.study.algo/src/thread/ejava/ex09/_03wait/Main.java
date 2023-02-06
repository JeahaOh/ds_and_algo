package thread.ejava.ex09._03wait;

public class Main {
    public static void main(String[] args) {
        Work sharedWork = new Work();
        
        ThreadA a = new ThreadA(sharedWork);
        ThreadB b = new ThreadB(sharedWork);
        
        a.start();
        b.start();
    }
}
