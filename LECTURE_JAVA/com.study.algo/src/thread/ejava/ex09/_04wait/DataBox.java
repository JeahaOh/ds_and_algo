package thread.ejava.ex09._04wait;

public class DataBox {
    private String data;
    
    // 소비자의 임계영역
    public synchronized String getData() {
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        
        String returnValue = this.data;
        System.out.println("Consumer READ : " + returnValue);
        data = null;
        notify();
        
        return returnValue;
    }
    
    // 생산자의 임계영역
    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        
        this.data = data;
        System.out.println("Producer SET : " + data);
        notify();
    }
}
