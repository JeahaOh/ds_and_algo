package thread.ejava.ex12;

/**
 * thread group의 interrupted()를 호출하면 해당 그룹에 속한 모든 스레드에 interrupt 요청을 보낼 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");
        WorkThread workA = new WorkThread(group, "work thread a");
        WorkThread workB = new WorkThread(group, "work thread b");
        
        workA.start();
        workB.start();
        
        System.out.println("[main thread's group's list()\n");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        System.out.println("\n\n[group thread is called interrupt");
        group.interrupt();
    }
}

