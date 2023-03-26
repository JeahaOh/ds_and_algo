package do_it.chap04._03;

public class IntQueue {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;
    
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }
    
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }
    
    public IntQueue(int maxLen) {
        num = front = rear = 0;
        capacity = maxLen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
    
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity)
            throw new OverflowIntQueueException();
        
        que[rear++] = x;
        num++;
        
        if (rear == capacity)
            rear = 0;
        
        return x;
    }
    
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        
        int x = que[front++];
        num--;
        
        if (front == capacity)
            front = 0;
        
        return x;
    }
    
    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        
        return que[front];
    }
    
    public void clear() {
        num = front = rear = 0;
    }
    
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) return idx;
        }
        
        return -1;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public int size() {
        return this.num;
    }
    
    public boolean isEmpty() {
        return num <= 0;
    }
    
    public boolean isFull() {
        return num >= capacity;
    }
    
    public void dump() {
        if (num <= 0)
            System.out.println("QUEUE IS EMPTY");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            
            System.out.println();
        }
    }
}
