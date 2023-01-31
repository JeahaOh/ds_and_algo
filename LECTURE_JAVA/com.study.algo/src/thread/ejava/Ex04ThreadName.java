package thread.ejava;


public class Ex04ThreadName {
    
    public static void main(String[] args) {
        Thread mainTread = Thread.currentThread();
        System.out.println("program start : " + mainTread.getName());
        
        Thread threadA = new Ex04ThreadA();
        System.out.println("thread : " + threadA.getName());
        threadA.start();
        
        Thread threadB = new Ex04ThreadB();
        System.out.println("thread : " + threadB.getName());
        threadB.start();
    }
}

