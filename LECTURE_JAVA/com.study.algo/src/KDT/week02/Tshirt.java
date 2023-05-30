package KDT.week02;

import java.util.Arrays;

public class Tshirt {
    public static int solution(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);
        
        int answer = 0;
        
        int i = tshirts.length - 1;
        for (int j = people.length - 1; j >= 0 && i >= 0; j--) {
            if (tshirts[i] >= people[j]) {
                answer += 1;
                i -= 1;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int[] people = {2, 3};
        int[] tshirts = {1, 2, 3};
    
        System.out.println(solution(people, tshirts));
    }
}
