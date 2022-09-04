/**
 * 비트 or 연산자, String format으로 16자(조건에서 나온 최대 길이)로 만듦
 * n으로 길이를 자름, replaceAll로 지도 완성.
 */
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];
    String temp;
    
    for (int i = 0; i < n; i++) {
      temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
      answer[i] = temp.substring(temp.length() - n)
                      .replaceAll("1", "#")
                      .replaceAll("0", " ");
    }
    
    return answer;
  }
}

class Solution {
  /**
   * 이진수 변환
   * n이 1 이상이라면 재귀호출한다
   */
  public String toBinary(int n, int size, StringBuilder sb) {
    if (n <= 1) {
      sb.append(String.valueOf(n));
      while (sb.length() < size) {
        sb.append("0");
      }
      return sb.reverse().toString();
    } else {
      sb.append(String.valueOf(n % 2));
      n /= 2;
      return toBinary(n, size, sb);
    }
  }
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];
    
    for (int i = 0; i < n; i++) {
      String a = toBinary(arr1[i], n, new StringBuilder());
      String b = toBinary(arr2[i], n, new StringBuilder());
      StringBuilder tmp = new StringBuilder();
      // 이진수로 변환된 두 문자열을 loop, 각 인덱스의 char 중 1이 있다면 # append
      for (int j = 0; j < n; j++) {
        if (a.charAt(j) == '1' || b.charAt(j) == '1') {
          tmp.append("#");
        } else {
          tmp.append(" ");
        }
      }
      answer[i] = tmp.toString();
    }
    return answer;
  }
}