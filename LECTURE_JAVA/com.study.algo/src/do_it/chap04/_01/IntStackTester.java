package do_it.chap04._01;

import do_it.Input;

public class IntStackTester {

    private static final String menuInfo = "[1] push   [2] pop    [3] peek" +
                                   "\n[4] dump   [5] search [6] clear" +
                                   "\n[7] status [9] exit\n";

    public static void main(String[] args) {
        IntStack s = new IntStack(64);
        
        while (true) {
            System.out.println("\n" + ("-".repeat(10)));
            System.out.printf("NOW DATA : %d / %d\n", s.size(), s.getCapacity());
            
            int selectedMenu = Input.integer(menuInfo);
            //System.out.println(menu);
            if (selectedMenu == 9) break;
            
            int x;
            switch (selectedMenu) {
                case 1 :
                    // push
                    x = Input.integer("DATA");
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException oise) {
                        System.out.println("STACK IS FULL");
                    }
                    break;
                    
                case 2 :
                    // pop
                    try {
                        x = s.pop();
                        System.out.println("POP RESULT : " + x);
                    } catch (IntStack.EmptyIntStackException eise) {
                        System.out.println("STACK IS EMPTY");
                    }
                    break;
                    
                case 3 :
                    // peek
                    try {
                        x = s.peek();
                        System.out.println("PEEK DATA : " + x);
                    } catch (IntStack.EmptyIntStackException eise) {
                        System.out.println("STACK IS EMPTY");
                    }
                    break;
                
                case 4 :
                    // dump
                    s.dump();
                    break;

                case 5 :
                    // search
                    int target = Input.integer("TARGET TO SEARCH");
                    int n = s.indexOf(target);

                    if (n >= 0)
                        System.out.println((s.size() - n) + " FROM THE TOP");
                    else
                        System.out.println("NO DATA");
                    break;
                
                case 6 :
                    // clear
                    s.clear();
                    break;
                
                case 7 :
                    // print
                    String status = String.format("CAPACITY : %d\nSIZE : %d\nIS EMPTY : %b\nIS FULL : %b", s.getCapacity(), s.size(), s.isEmpty(), s.isFull());
                    System.out.println(status);
                    break;
                    
                default : System.exit(1);
            }
        }
    }
}
