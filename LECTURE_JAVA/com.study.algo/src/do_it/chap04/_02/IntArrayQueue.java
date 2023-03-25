package do_it.chap04._02;

// 연습 4 - 4
// int 형 고정 길이 큐
public class IntArrayQueue {
  // 큐의 본체
  private int[] que;
  // 큐의 용량
  private int capacity;
  // 현재 데이터 갯수
  private int num;

  public class EmptyIntArrayQueueException extends RuntimeException {
    public EmptyIntArrayQueueException() {}
  }

  public class OverflowIntArrayQueueException extends RuntimeException {
    public OverflowIntArrayQueueException() {}
  }

  public IntArrayQueue(int maxLen) {
    num = 0;
    capacity = maxLen;
    try {
      que = new int[capacity];
    } catch (OutOfMemoryError e) {
      capacity = 0;
    }
  }

  public int enque(int x) throws OverflowIntArrayQueueException {
    if (num >= capacity)
      throw new OverflowIntArrayQueueException();

    que[num++] = x;
    return x;
  }

  public int deque() throws EmptyIntArrayQueueException {
    if (num <= 0)
      throw new EmptyIntArrayQueueException();

    int x = que[0];

    for (int i = 0; i < num - 1; i++)
      que[i] = que[i + 1];

    num--;
    return x;
  }

  public int peek() throws EmptyIntArrayQueueException {
    if (num <= 0)
      throw new EmptyIntArrayQueueException();

    return que[0];
  }

  public int indexOf(int x) {
    for (int i = 0; i < num; i++)
      if (que[i] == x) return i;

    return -1;
  }

  public void clear() {
    num = 0;
  }

  public int getCapacity() {
    return capacity;
  }

  public int size() {
    return num;
  }

  public boolean isEmpty() {
    return num <= 0;
  }

  public boolean isFull() {
    return num >= capacity;
  }

  public void dump() {
    if (num <= 0)
      System.out.println("QUEUE IS EMPTY!");
    else {
      for (int i = 0; i < num; i++)
        System.out.print(que[i] + " ");
      System.out.println();
    }
  }
}
