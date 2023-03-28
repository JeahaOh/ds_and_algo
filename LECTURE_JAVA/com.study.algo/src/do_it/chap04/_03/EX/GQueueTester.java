package do_it.chap04._03.EX;

import do_it.Input;

import java.util.Scanner;

// 연습 4 - 7
// 제네릭 큐 테스트 프로그램
public class GQueueTester {
    private static final String menuInfo = "[1] enqueue   [2] dequeue    [3] peek" +
            "\n[4] dump   [5] search [6] clear" +
            "\n[7] status [9] exit\n";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericQueue<String> q = new GenericQueue(64);
    
        while (true) {
            System.out.println("\n" + ("-".repeat(10)));
            System.out.printf("NOW DATA : %d / %d\n", q.size(), q.getCapacity());
        
            int selectedMenu = Input.integer(menuInfo);
            //System.out.println(menu);
            if (selectedMenu == 9) break;
        
            int idx;
            String x;

            switch (selectedMenu) {
                case 1 :
                    System.out.print("DATA : ");
                    x = sc.next();
                    try {
                        q.enque(x);
                    } catch (GenericQueue.OverflowGQueueException e) {
                        System.out.println("QUEUE IS FULL!");
                    }
                    break;
            
                case 2 :
                    try {
                        x = q.deque();
                        System.out.println("DEQUEUE RESULT : " + x);
                    } catch (GenericQueue.EmptyGQueueException e) {
                        System.out.println("QUEUE IS EMPTY!");
                    }
                    break;
            
                case 3 :
                    try {
                        x = q.peek();
                        System.out.println("PEEK RESULT : " + x);
                    } catch (GenericQueue.EmptyGQueueException e) {
                        System.out.println("QUEUE IS EMPTY!");
                    }
                    break;
            
                case 4 :
                    q.dump();
                    break;

                case 5 :
                    System.out.print("DATA TO SEARCH :");
                    String str = sc.next();
                    int n = q.search(str);
                    if (n != 0)
                        System.out.printf("%d @ INDEX OF %d", n, q.indexOf(str));
                    else
                        System.out.println("NO DATA");
                    break;
                    
                case 6 :
                    q.clear();
                    break;
            }
        }
    }
}
