class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    int correctCnt = 0;
    int zeroCnt = 0;
    
    for (int num : lottos) {
      if (num == 0) zeroCnt++;
      else {
        for (int win : win_nums) {
          if (num == win) correctCnt++;
        }
      }
    }
    
    int min = 7 - correctCnt >= 6 ? 6 : 7 - correctCnt;
    int max = min - zeroCnt < 1 ? 1 : min - zeroCnt;
    
    return new int[] {max, min};
  }
}