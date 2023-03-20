package do_it.chap04._01;

import do_it.Input;

public class IntStackTester {
    public static void main(String[] args) {
        IntStack s = new IntStack(64);
        
        while (true) {
            System.out.println("\n" + ("-".repeat(10)));
            System.out.printf("NOW DATA : %d / %d\n", s.size(), s.getCapacity());
            
            int menu = Input.integer("(1) push (2) pop (3) peek (4) dump (0) exit");
            if (menu < 1 || menu > 4) break;
            
            int x;
            switch (menu) {
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
                    s.dump();
                    break;
            }
        }
    }
}
