package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_03 {

//  public static String solution(String str) {
//    String[] strArray = str.split(" ");
//    String maxLengthStr = "";
//    for (String partial : strArray) {
//      if (partial.length() > maxLengthStr.length()) {
//        maxLengthStr = partial;
//      }
//    }
//    return maxLengthStr;
//  }
  
//  public static String solution(String str) {
//    String answer = "";
//    String[] strArray = str.split(" ");
//    int max = Integer.MIN_VALUE;
//    for (String patial : strArray) {
//      if (max < patial.length()) {
//        max = patial.length();
//        answer = patial;
//      }
//    }
//    return answer;
//  }
  
  public static String solution(String str) {
    String answer = "";
    int m = Integer.MIN_VALUE, pos;
    while ((pos = str.indexOf(' ')) != -1) {
      String partial = str.substring(0, pos);
      int length = partial.length();
      if (length > m) {
        m = length;
        answer = partial;
      }
      str = str.substring(pos + 1);
    }
    if (str.length() > m) answer = str;
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    System.out.println(solution(str));
  }
}