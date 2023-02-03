package thread.ejava.ex06;

public class Cal {
    private int memo;
    
    public int getMemo() {
        return this.memo;
    }
    
    public void setMemo(int memo) {
        this.memo = memo;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        System.out.println(Thread.currentThread().getName() + " : " + this.memo);
    }
}
