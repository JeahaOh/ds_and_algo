package thread.ejava.ex09._02join;

public class Main {
    public static void main(String[] args) {
        SumThread s = new SumThread();
        s.start();
        
        try {
            s.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        System.out.println("SUM : " + s.getSum());
    }
}

