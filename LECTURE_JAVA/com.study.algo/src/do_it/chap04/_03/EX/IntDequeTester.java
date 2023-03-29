package do_it.chap04._03.EX;

import do_it.Input;

// 연습 4 - 7
// 양방향 대기열 (double ended queue, deque)
// int 형 고정길이 덱의 테스트
public class IntDequeTester {

    private static final String menuInfo =
              "[1] front enqueue [2] front dequeue [3] front peek" +
            "\n[4] rear enqueue  [5] rear dequeue  [6] rear peek" +
            "\n[7] dump [8] search [9] exit\n";

  public static void main(String[] args) {
    IntDeque q = new IntDeque(64);

    while (true) {
      System.out.println("\n" + ("-".repeat(10)));
      System.out.printf("NOW DATA : %d / %d\n", q.size(), q.getCapacity());
      
      int selectedMenu = Input.integer(menuInfo);
      if (selectedMenu == 9) break;

      int x = 0, idx;

      switch (selectedMenu) {
        case 1 :
          Input.integer("DATA");
          try {
            q.enqueFront(x);
          } catch (IntDeque.OverflowIntDequeException e) {
            System.out.println("QUEUE IS FULL!");
          }
          break;
          
        case 2 :
          try {
            x = q.dequeFront();
            System.out.println("DEQUEUE FRONT RESULT : " + x);
          } catch (IntDeque.EmptyIntDequeException e) {
            System.out.println("DEQUE IS EMPTY!");
          }
          break;
          
        case 3 :
          try {
            x = q.peekFront();
            System.out.println("PEEK FRONT RESULT : " + x);
          } catch (IntDeque.EmptyIntDequeException e) {
            System.out.println("DEQUE IS EMPTY!");
          }
          break;
          
        case 4 :
          Input.integer("DATA");
          try {
            q.enqueRear(x);
          } catch (IntDeque.OverflowIntDequeException e) {
            System.out.println("QUEUE IS FULL!");
          }
          break;

        case 5 :
          try {
            x = q.dequeRear();
            System.out.println("DEQUEUE REAR RESULT : " + x);
          } catch (IntDeque.EmptyIntDequeException e) {
            System.out.println("DEQUE IS EMPTY!");
          }
          break;
          
        case 6 :
          try {
            x = q.peekRear();
            System.out.println("PEEK REAR RESULT : " + x);
          } catch (IntDeque.EmptyIntDequeException e) {
            System.out.println("DEQUE IS EMPTY!");
          }
          break;
          
        case 7 :
          q.dump();
          break;
          
        case 8 :
          x = Input.integer("DATA TO SEARCH");
          int n = q.search(x);
          if (n != 0)
              System.out.printf("%d @ INDEX OF %d", n, q.indexOf(x));
          else
              System.out.println("NO DATA");
          break;
          
      }
    }


  }
}
