package KDT.week03._04;

public class CandyPalindrome {
    public static int[] solution (String candy, int[] positions) {
        int i = 0;
        int[] backwardIndices = new int[candy.length()];
        
        for (int j = 1; j < candy.length(); j++) {
            final char ch = candy.charAt(j);
            
            while (i > 0 && ch != candy.charAt(i)) {
                i = backwardIndices[i];
            }
            
            if (ch == candy.charAt(i)) i += 1;
            backwardIndices[j] = i;
        }
        
        int [] answer = new int[positions.length];
        for (int j = 0; j < positions.length; j++) {
            int count = 0;
            int k = positions[j] - 1;
            
            while (backwardIndices[k] > 0) {
                k = backwardIndices[k] - 1;
                if (k < 0) break;
                count++;
            }
            
            answer[j] = count;
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
        String candy = "RYRYRGPRYRYRBB";
        int[] positions = {12, 1, 14, 7};
        
        for (int i : solution(candy, positions)) {
            System.out.printf(" %d,", i);
        }
        System.out.println();
    
        candy = "BPBRBPBRB";
        positions = new int[]{3, 6, 9};
    
        for (int i : solution(candy, positions)) {
            System.out.printf(" %d,", i);
        }
        System.out.println();
    }
}
