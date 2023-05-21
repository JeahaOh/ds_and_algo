package KDT.week01._02;

import java.util.stream.*;

class GreaterNumber {
    static String solution(int[] numbers) {
        // 숫자 -> 문자 -> 문자열 내림차순 정렬 -> 조합
        String answer = IntStream.of(numbers)
            .mapToObj(String::valueOf)
            .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
            .collect(Collectors.joining());
        
        if (answer.startsWith("0")) return "0";
        else return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
/**
 * java를 사용한다 === java가 제공하는 lib.를 사용한다.
 * 기본 lib.인 java.lang.*과 java.util.* 사용을 숙지한다.
 */