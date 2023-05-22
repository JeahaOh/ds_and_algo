package KDT.week03._01;

import java.util.Arrays;
import java.util.HashMap;

import static java.util.stream.Collectors.*;

public class Clothes {
//    public static int solution(String [][] clothes) {
//        int answer = 1;
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        for (int i = 0; i < clothes.length; i++) {
//            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
//        }
//
//        for (String key : hm.keySet()) {
//            answer *= (hm.get(key) + 1);
//        }
//
//        answer -= 1;
//
//        return answer;
//    }
    
    public static int solution(String [][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
                
    }
    
    public static void main(String[] args) {
        String[][] clothes = new String[][] {
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
        };
        
        System.out.println(solution(clothes));
        
        clothes = new String[][] {
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}
        };
        
        System.out.println(solution(clothes));
    }
}
