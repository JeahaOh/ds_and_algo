package do_it.chap04._03.EX;

// 연습 4 - 7
// 제네릭 큐
public class GenericQueue<E> {

  public static class EmptyGQueueException extends RuntimeException {
    public EmptyGQueueException() {}
  }

  public static class OverflowGQueueException extends RuntimeException {
    public OverflowGQueueException() {}
  }

  private E[] que;
  private int capacity;
  private int num;
  private int front;
  private int rear;

  public GenericQueue(int maxLen) {
    num = front = rear = 0;
    capacity = maxLen;
    try {
      que = (E []) new Object[capacity];
    } catch (OutOfMemoryError e) {
      capacity = 0;
    }
  }

  public E enque(E x) throws OverflowGQueueException {
    if (num >= capacity)
      throw new OverflowGQueueException();

    que[rear++] = x;
    num++;

    if (rear == capacity)
      rear = 0;

    return x;
  }

  public E deque() throws EmptyGQueueException {
    if (num <= 0)
      throw new EmptyGQueueException();

    E x = que[front++];
    num--;

    if (front == capacity)
      front = 0;

    return x;
  }

  public E peek() throws EmptyGQueueException {
    if (num <= 0)
      throw new EmptyGQueueException();

    return que[front];
  }

  public int indexOf(E x) {
    for (int i = 0; i < num; i++)
      if (que[(i + front) % capacity].equals(x))
        return i + front;

    return -1;
  }

  public int search(E x) {
    for (int i = 0; i < num; i++)
      if (que[(i + front) % capacity].equals(x))
        return i + 1;

    return -1;
  }

  public void clear() {
    num = front = rear = 0;
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
      System.out.println("QUEUE IS EMPTY");
    else {
      for (int i = 0; i < num; i++)
        System.out.print(que[(i + front) % capacity].toString() + " ");
      System.out.println();
    }
  }
}
