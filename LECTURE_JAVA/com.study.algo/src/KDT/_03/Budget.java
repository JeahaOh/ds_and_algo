package KDT._03;

import java.util.stream.IntStream;

public class Budget {
//    static int solution(int[] budgets, int M) {
//        int min = 0;
//        int max = 0;
//
//        for (int b : budgets) {
//            if (b > max) max = b;
//        }
//
//        int answer = 0;
//        while (min <= max) {
//            int mid = (min + max) / 2;
//            int sum = 0;
//            for (int b : budgets) {
//                if (b > mid) sum += mid;
//                else sum += b;
//            }
//
//            if (sum <= M) {
//                min = mid + 1;
//                answer = mid;
//            } else {
//                max = mid - 1;
//            }
//        }
//
//        return answer;
//    }
    
    static int solution(int[] budgets, int M) {
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);
        
        int answer = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();
            
            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int [] budgets = {120, 110, 140, 150};
        int M = 485;
        System.out.println(solution(budgets, M));
    }
}
/**
 * 문제 해결
 * 리팩토링
 */