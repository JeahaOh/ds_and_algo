package etc.ds;

import java.util.NoSuchElementException;

/**
 * Queue 구현하기
 * FIFO
 * add() : 마지막에 데이터 넣기
 * remove() : 처음 데이터 꺼내기
 * peek() : 처음 데이터 확인하기
 * isEmpty() : Queue가 비었는지 확인하기
 */
class Queue<T> {
    class Node<T> {
        private T data;
        private Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }
    
    private Node<T> first;
    private Node<T> last;
    
    public void add(T item) {
        Node<T> t = new Node<T>(item);
        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }
    
    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        
        T data = first.data;
        first = first.next;
        
        if (first == null) {
            last = null;
        }
        
        return data;
    }
    
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        
        return first.data;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public static void main (String[] args) {
        Queue<Integer> q = new Queue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
