package thread.ejava.ex11;

import thread.ejava.ex10.DemonThread;

import java.util.Map;

/**
 * 현재 프로세스 내에서 실행하는 모든 스레드에 대한 정보를 얻어와 그룹 이름을 얻을 수 있다.
 */
public class GroupMain {
    
    public static void main(String[] args) {
        DemonThread sub = new DemonThread();
        sub.setName("SUB THREAD");
        sub.setDaemon(true);
        sub.start();
        
        Map<Thread, StackTraceElement[]> threadInfos = Thread.getAllStackTraces();
        
        threadInfos.keySet().forEach(thread -> {
            System.out.println("NAME : " + thread.getName() + ((thread.isDaemon()) ? "(DEMON)" : "(MAIN)"));
            System.out.println("\t group : " + thread.getThreadGroup().getName());
            System.out.println();
        });
    }
}
