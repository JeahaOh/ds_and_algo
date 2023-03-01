package inflearn.basic.a_string;

import java.util.Scanner;

public class Ex_01 {
  
  public static int solution(String str, char t) {
    int answer = 0;
    str = str.toLowerCase();
    t = Character.toLowerCase(t);
    
//    for (int i = 0; i < str.length(); i++) {
//      if (str.toLowerCase().charAt(i) == t) {
//        answer++;
//      }
//    }
    
    for (char c : str.toCharArray()) {
      if (c == t) answer++;
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    String str = in.next();
    char t = in.next().charAt(0);
    
    System.out.println(solution(str, t));
  }
}
