package thread.ejava;

public class Ex05CalcThread extends Thread {
    
    public Ex05CalcThread(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2_000_000_000; i++) {
        
        }
        
        System.out.println(getName());
    }
}
