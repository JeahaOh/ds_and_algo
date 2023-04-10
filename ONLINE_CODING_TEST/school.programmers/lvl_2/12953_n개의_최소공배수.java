class Solution {
    public int solution(int[] arr) {
        int maxNumber = 0;
        for (int number : arr) {
            maxNumber = Math.max(maxNumber, number);
        }
        
        int lcm = maxNumber;
        boolean isLcm = false;
        
        while (!isLcm) {
            isLcm = true;
            
            for (int number : arr) {
                if (lcm % number != 0) {
                    isLcm = false;
                    break;
                }
            }
            
            if (!isLcm) {
                lcm += maxNumber;
            }
        }
        
        return lcm;
    }
}