package a_string;

import java.util.Scanner;

public class Ex_05 {
  public static String solution(String str) {
    char[] chars = str.toCharArray();
    int head = 0, tail = str.length() - 1;
    while (head < tail) {
      if (!isStr(chars[head])) {
        head++;
      } else if (!isStr(chars[tail])) {
        tail--;
      } else {
        chars[head] ^= chars[tail];
        chars[tail] ^= chars[head];
        chars[head] ^= chars[tail];
        head++;
        tail--;
      }
    }
    return String.valueOf(chars);
  }
  
  public static boolean isStr(char c) {
    // return (65 <= c && c <= 90) || (97 <= c && c <= 122);
    return Character.isAlphabetic(c);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(solution(str));
  }
}