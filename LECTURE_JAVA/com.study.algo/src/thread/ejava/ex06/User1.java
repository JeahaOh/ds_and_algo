package thread.ejava.ex06;

public class User1 extends Thread {
    private Cal cal;
    
    public void setCal(Cal cal) {
        this.setName(this.getClass().getSimpleName());
        this.cal = cal;
    }
    
    @Override
    public void run() {
        this.cal.setMemo(Integer.MAX_VALUE);
    }
}
