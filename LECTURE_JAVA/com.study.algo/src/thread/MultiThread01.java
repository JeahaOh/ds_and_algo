package thread;

public class MultiThread01 implements Runnable {
    int testNum = 0;
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("=".repeat(10));
                testNum++;
            }
            
            System.out.println("ThreadName : " + Thread.currentThread().getName());
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        MultiThread01 te1 = new MultiThread01();
        MultiThread01 te2 = new MultiThread01();
        
        Thread t1 = new Thread(te1, "A");
        Thread t2 = new Thread(te2, "B");
        
        t1.start();
        t2.start();
        
        System.out.println(Thread.currentThread().getName());
    }
}
