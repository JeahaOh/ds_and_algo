class Solution {
  public int[] solution(String s) {
    int[] answer = new int[2];
    
    while (s.length() > 1) {
      int cntZero = 0;
      
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0') answer[1]++;
        else cntZero++;
      }
      
      s = Integer.toBinaryString(cntZero);
      answer[0]++;
    }
    return answer;
  }
}