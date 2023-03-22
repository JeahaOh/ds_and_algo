package do_it.chap04._01.EX;

import do_it.Input;
import do_it.chap04._01.IntStack;

import java.util.Scanner;

public class GStackTester {
    
    private static final String menuInfo = "[1] push   [2] pop    [3] peek" +
            "\n[4] dump   [5] search [6] clear" +
            "\n[7] status [9] exit\n";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericStack s = new GenericStack<String>(64);
    
        while (true) {
            System.out.println("\n" + ("-".repeat(10)));
            System.out.printf("NOW DATA : %d / %d\n", s.size(), s.getCapacity());
        
            int selectedMenu = Input.integer(menuInfo);
            //System.out.println(menu);
            if (selectedMenu == 9) break;
        
            String x;
            switch (selectedMenu) {
                case 1 :
                    // push
                    System.out.print("DATA : ");
                    x = sc.next();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException oise) {
                        System.out.println("STACK IS FULL");
                    }
                    break;
            
                case 2 :
                    // pop
                    try {
                        x = (String) s.pop();
                        System.out.println("POP RESULT : " + x);
                    } catch (IntStack.EmptyIntStackException eise) {
                        System.out.println("STACK IS EMPTY");
                    }
                    break;
            
                case 3 :
                    // peek
                    try {
                        x = (String) s.peek();
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
                    System.out.println("TARGET TO SEARCH : ");
                    x = sc.next();
                    int n = s.indexOf(x);
                
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