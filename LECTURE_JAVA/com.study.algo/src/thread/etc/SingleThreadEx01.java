package thread.etc;

public class SingleThreadEx01 extends Thread {
    private int[] temp;
    
    public SingleThreadEx01(String threadname) {
        super(threadname);
        temp = new int[10];
        
        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }
    
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
        SingleThreadEx01 st = new SingleThreadEx01("first");
        st.start();
    }
}
