package do_it.chap03._05.EX;

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        
        System.out.println("A : " + a.getId());
        System.out.println("B : " + b.getId());
        
        System.out.println("ID count : " + Id.getCounter());
    }
}
