package do_it.chap04._03;

import do_it.Input;

import java.util.Scanner;

public class IntQueueTester {
    
    private static final String menuInfo = "[1] enqueue   [2] dequeue    [3] peek" +
            "\n[4] dump   [5] search [6] clear" +
            "\n[7] status [9] exit\n";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue q = new IntQueue(64);
    
        while (true) {
            System.out.println("\n" + ("-".repeat(10)));
            System.out.printf("NOW DATA : %d / %d\n", q.size(), q.getCapacity());
        
            int selectedMenu = Input.integer(menuInfo);
            //System.out.println(menu);
            if (selectedMenu == 9) break;
        
            int x = 0;
            switch (selectedMenu) {
                case 1 :
                    x = Input.integer("DATA");
                    try {
                        q.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("QUEUE IS FULL!");
                    }
                    break;
            
                case 2 :
                    try {
                        x = q.deque();
                        System.out.println("DEQUEUE RESULT : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("QUEUE IS EMPTY!");
                    }
                    break;
            
                case 3 :
                    try {
                        x = q.peek();
                        System.out.println("PEEK RESULT : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("QUEUE IS EMPTY!");
                    }
                    break;
            
                case 4 :
                    q.dump();
                    break;

                case 5 :
                    x = Input.integer("DATA TO SEARCH");
                    int n = q.search(x);
                    if (n != 0)
                        System.out.printf("%d @ INDEX OF %d", n, q.indexOf(x));
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
