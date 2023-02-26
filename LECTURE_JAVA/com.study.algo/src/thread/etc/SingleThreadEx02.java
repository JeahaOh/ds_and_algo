package thread.etc;

import static java.lang.Thread.currentThread;

public class SingleThreadEx02 implements Runnable {
    
    private int[] temp;
    
    public SingleThreadEx02() {
        temp = new int[10];
        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }
    
    @Override
    public void run() {
        for (int start : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            
            System.out.println("thread name : " + currentThread().getName());
            System.out.println("temp value : " + start);
        }
    }
    
    public static void main(String[] args) {
        SingleThreadEx02 ct = new SingleThreadEx02();
        Thread t = new Thread(ct, "first");
        t.start();
    }
}
