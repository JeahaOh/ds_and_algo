package a_string;
import java.util.Scanner;

public class Ex_07 {
  public static String solution(String str) {
//    str = str.toLowerCase();
//    int limit = str.length();
//    for (int idx = 0; idx < limit / 2; idx++) {
//      if (str.charAt(idx) != str.charAt(limit - idx - 1)) return "NO";
//    }
//    return "YES";
    String sb = new StringBuilder(str).reverse().toString();
    
    if (str.equalsIgnoreCase(sb)) return "YES";
    else return "NO";
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(solution(str));
  }
}