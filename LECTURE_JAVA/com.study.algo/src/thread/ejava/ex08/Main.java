package thread.ejava.ex08;

/**
 * Thread 상태
 * 스레드 상태에 따른 열거 상수
 * - 객체 생성
 *      - NEW : 스레드 객체 생성, start() 호출 전
 * - 실행 대기
 *      - RUNNABLE : 실행 대기상태, 언제든 실행 가능
 * - 일시 정지
 *      - WAITING : 다른 스레드가 통지할 때까지 기다리는 상태
 *      - TIMED_WAITING : 주어진 시간 동안 기다리는 상태
 *      - BLOCKED : 사용하고자 하는 객체의 lock이 풀릴 때까지 기다리는 상태
 * - 종교
 *      - TERMINATED : 실행을 마친 상태
 */
public class Main {
    
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetTread());
        new StatePrintThread(new TargetTread()).start();
        statePrintThread.start();
    }
}

