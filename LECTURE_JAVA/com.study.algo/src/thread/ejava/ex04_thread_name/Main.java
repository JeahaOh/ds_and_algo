package thread.ejava.ex04_thread_name;

/**
 * Thread Name
 */
public class Main {
    
    public static void main(String[] args) {
        Thread mainTread = Thread.currentThread();
        System.out.println("program start : " + mainTread.getName());
        
        Thread threadA = new ThreadA();
        System.out.println("thread : " + threadA.getName());
        threadA.start();
        
        Thread threadB = new ThreadB();
        System.out.println("thread : " + threadB.getName());
        threadB.start();
    }
}

