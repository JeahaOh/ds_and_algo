class Solution {
  public int solution(int[][] sizes) {
    int maxW = Integer.MIN_VALUE;
    int maxH = Integer.MIN_VALUE;
    // {w, h}
    for (int i = 0; i < sizes.length; i++) {
      if (sizes[i][0] < sizes[i][1]) {
        sizes[i][0] ^= sizes[i][1];
        sizes[i][1] ^= sizes[i][0];
        sizes[i][0] ^= sizes[i][1];
      }
      maxW = Math.max(maxW, sizes[i][0]);
      maxH = Math.max(maxH, sizes[i][1]);
    } 
    return maxW * maxH;
  }
}