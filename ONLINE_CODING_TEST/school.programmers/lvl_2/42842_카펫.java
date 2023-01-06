class Solution {
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
    int sum = brown + yellow;
    
    // 가로 세로가 3 이상이여야 함
    for (int height = 3; height < sum; height++) {
        
      int width = sum / height;
      
      if (sum % height == 0 && width >= 3) {
        int col = Math.max(height, width);
        int row = Math.min(height, width);
        
        // 상하좌우 끝을 제외하기 위해서 - 2
        int center = (col - 2) * (row - 2);
        
        // 가운데에 노란색이 모두 위치할 수 있다.
        if (center == yellow) {
          answer[0] = col;
          answer[1] = row;
          
          return answer;
        }
      }
    }
    
    return answer;
  }
}