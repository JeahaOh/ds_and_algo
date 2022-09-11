class Solution {
  public String solution(String s) {
    String[] strs = s.split(" ");
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (String str : strs) {
      int value = Integer.valueOf(str);
      min = Math.min(min, value);
      max = Math.max(max, value);
    }
    return min + " " + max;
  }
}