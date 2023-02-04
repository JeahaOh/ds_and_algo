package thread.ejava.ex07;

public class User2 extends Thread {
    private Cal cal;
    
    public void setCal(Cal cal) {
        this.setName(this.getClass().getSimpleName());
        this.cal = cal;
    }
    
    @Override
    public void run() {
        this.cal.setMemo(0);
    }
}
