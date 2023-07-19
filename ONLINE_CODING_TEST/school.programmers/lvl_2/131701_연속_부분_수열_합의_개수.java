import java.util.Set;
import java.util.HashSet;

class Solution {
    public static int solution(int[] elements) {
        int size = elements.length;
        int[] liner = new int[size * 2];

        // 연속 하도록 길이를 2배로 만듦
        for (int i = 0; i < size; i++) {
            liner[i] = liner[i + size] = elements[i];
        }

        // 중복은 없도록 Set에 담기
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int sum = 0;
            // 수열의 시작점과 끝 지점 바꿔가며 반복, 조합의 합 구하기
            for (int j = i; j < i + size; j++) {
                //System.out.printf("%ni : %d, j : %d, sum : %d, ele : %d", i, j, sum, liner[j]);
                sum += liner[j];
                set.add(sum);
            }
        }

        return set.size();
    }
}