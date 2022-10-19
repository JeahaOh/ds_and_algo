class Solution {
  public String solution(String s) {
    StringBuilder sb = new StringBuilder();
    boolean flag = true;
    s = s.toLowerCase();
    
    for (char c : s.toCharArray()) {
      if (flag) {
        c = Character.toUpperCase(c);
      }
      sb.append(c);
      
      flag = Character.isWhitespace(c) ? true : false;
    }
    
    return sb.toString();
  }
}