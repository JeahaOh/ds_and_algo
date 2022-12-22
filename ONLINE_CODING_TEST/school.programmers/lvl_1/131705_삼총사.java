class Solution {
  static int ans[] = new int[3];
  static int numArr[];
  static int N;
  static int resultCount = 0;
  
  public int solution(int[] number) {
    N = number.length;
    numArr = number;
    
    dfs(0, 0);
    
    return resultCount;
  }
  
  private static void dfs(int idx, int depth) {
    if (depth == 3) {
      int sum = 0;
      for (int i = 0; i < 3; i++) {
        sum += ans[i];
      }
      
      if (sum == 0) {
        resultCount++;
      }
      
      return;
    }
    
    for (int i = idx; i < N; i++) {
      ans[depth] = numArr[i];
      dfs(i + 1, depth + 1);
    }
  }
}