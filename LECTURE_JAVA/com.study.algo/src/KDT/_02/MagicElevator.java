package KDT._02;

public class MagicElevator {
    public static int solution(int storey) {
        return elevator(storey);
    }

    static int elevator(int floor) {
        if (floor <= 1) return floor;
    
        int less = floor % 10;
        int rest = floor / 10;
    
        int bigStep = less + elevator(rest);
        int smallStep = (10 - less) + elevator(rest + 1);
    
        return Math.min(bigStep, smallStep);
    }
    
    public static void main(String[] args) {
        System.out.println(solution(16));
//        Solution.solution(2554);
    }
}
