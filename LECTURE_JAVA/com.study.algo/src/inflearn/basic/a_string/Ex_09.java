package inflearn.basic.a_string;
import java.util.Scanner;
public class Ex_09 {
  public static int solution(String str) {
    // solve 1
//    str = str.replaceAll("[^0-9]", "").trim();
//    return Integer.parseInt(str);
    // solve 2
//    int answer = 0;
//    for (char x : str.toCharArray()) {
//      if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//    }
//    return answer;
    
    // solve 3
    String answer = "";
    for (char x : str.toCharArray()) {
      if (Character.isDigit(x)) answer += x;
    }
    return Integer.parseInt(answer);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(solution(str));
  }
}