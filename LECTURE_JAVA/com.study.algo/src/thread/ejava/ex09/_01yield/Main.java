package thread.ejava.ex09._01yield;

/**
 * Thread 상태 제어
 * - interrupt() : 일시 정지 상태의 스레드에서 InterruptedException 예외를 발생,
 *                  예외처리 코드에서 실행 대기 상태로 가거나 종료 상태로 갈 수 있도록 한다.
 * - notify(), notifyAll() :
 *              동기화 블록 내에서 wait() 메소드에 의해 일시 정지 상태에 있는 스레드를 실행 대기 상태로 만든다.
 * - resume() : suspend() 네소드에 의해 일시 정지 상태에 있는 스레드를 실행 대기 상태로 만든다.
 *              Deprecated 되었으므로 notify(), notifyAll()을 사용한다
 * - sleep() : 주어진 시간동안 스레드를 일시 정지 상태로 만든다. 주어진 시간이 지나면 자동으로 실행 대기 상태가 된다.
 * - join() : join()을 호출한 스레드는 일시 정지 상태가 된다.
 *              실행 대기 상태로 가려면 join() 메소드를 멤버로 가지는 스레드가 종료되거나,
 *              매개 값으로 주어진 시간이 지나야 한다.
 * - wait() : 동기화 블록 내에서 스레드를 일시 정지 상태로 만든다.
 *              매개 값으로 주어진 시간이 지나면 자동으로 실행 대기 상태가 된다.
 *              시간이 주어지지 않으면, notify(), notifyAll()을 호출해야 실행 대기 상태로 갈 수 있다.
 * - suspend() : 스레드를 일시 정지 상태로 만든다. Deprecated -> wait()를 사용한다.
 * - yield() : 실행 중에 우선 순위가 동일한 다른 스레드에게 실행을 양보하고, 실행 대기 상태가 된다.
 * - stop() : 스레드를 종료. Deprecated, 사용하지 말자.
 */
public class Main {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        
        a.start();
        b.start();
        
        try {
            Thread.sleep(30);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        a.work = false;
        
        try {
            Thread.sleep(30);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        a.work = true;
        
        try {
            Thread.sleep(30);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        
        a.stop = true;
        b.stop = true;
        
    }
}

