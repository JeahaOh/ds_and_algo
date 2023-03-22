package do_it.chap04._01.EX;

// 임의의 객체형을 쌓을 수 있는 테네릭 스택 클래서 Stack<E> 작성
public class GenericStack<E> {
    // 스택용 배열
    private E[] stk;
    // 스택 용량
    private int capacity;
    // 스택 포인터
    private int ptr;
    
    // 실행 시 예외 : 스택이 비어있는 경우
    public static class EmptyGStackException extends RuntimeException {
        public EmptyGStackException(){}
    }
    
    // 실행 시 예외 : 스택이 가득 찬 경우
    public static class OverflowGStackException extends RuntimeException {
        public OverflowGStackException(){}
    }
    
    // 생성자
    public GenericStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            // 스택 본채용 배열 생성
            stk = (E[])new Object[capacity];
        } catch (OutOfMemoryError e) {
            // 생성할 수 없음
            capacity = 0;
        }
    }
    
    // 스택에 X를 푸시
    public E push(E x) throws OverflowGStackException {
        if (ptr >= capacity)
            // 스택이 가득 찬 경우
            throw new OverflowGStackException();
        
        return stk[ptr++] = x;
    }
    
    // 스택에서 데이터를 팝 (꼭대기에 있는 데이터를 꺼냄)
    public E pop() throws EmptyGStackException {
        if (ptr <= 0)
            // 스택이 비어 있음
            throw new EmptyGStackException();
        
        return stk[--ptr];
    }
    
    // 스택에서 데이트를 피크 (꼭대기에 있는 데이터 조회)
    public E peek() throws EmptyGStackException {
        if (ptr <= 0)
            // 스택이 비어 있음
            throw new EmptyGStackException();
        
        return stk[ptr - 1];
    }
    
    // 스택을 비움
    public void clear() {
        // 모든 작업이 ptr 값으로 이루어 지므로 배열의 요소를 변경할 필요가 없음.
        ptr = 0;
    }
    
    // 스택에서 X 찾아 인덱스 반환, 없다면 -1 반환
    public int indexOf(Object x) {
        // 뒤(꼭대기)에서 부터 선형 탐색
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i].equals(x))
                // 검색 성공
                return i;
        }
        // 검색 실패
        return -1;
    }
    
    // 스택의 용량 반환
    public int getCapacity() {
        return this.capacity;
    }
    
    // 스택에 쌓여있는 데이터 개수 반환
    public int size() {
        return ptr;
    }
    
    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return ptr <= 0;
    }
    
    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        return ptr >= capacity;
    }
    
    public void dump() {
        if (ptr <= 0)
            System.out.println("EMPTY STACK");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            
            System.out.println("");
        }
    }
}
