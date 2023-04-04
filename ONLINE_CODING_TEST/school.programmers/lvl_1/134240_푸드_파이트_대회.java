class Solution {
    public String solution(int[] food) {
        String left = "", right = "";
        int length = food.length;
        int count;
        
        for (int i = 0; i < length; i++) {
            if (food[i] == 0) continue;
            
            count = food[i] / 2;
            if (count == 0) continue;
            
            for (int j = 0; j < count; j++) {
                left += Integer.toString(i);
            }
        }
        
        for (int i = left.length() - 1; i >= 0; i--) {
            right += left.charAt(i);
        }
        
        return left + "0" + right;
    }
}