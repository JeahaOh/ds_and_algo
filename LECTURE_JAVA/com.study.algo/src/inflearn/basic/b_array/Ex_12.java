package inflearn.basic.b_array;

import java.util.Scanner;

/**
 * 입력 값의 의미를 잘못 파악했다.
 * 4 3
 * 3 4 1 2
 * 4 3 2 1
 * 3 1 4 2
 */
public class Ex_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 학생 수
    int studentCnt = sc.nextInt();
    // 시험 수
    int testCnt = sc.nextInt();
    
    int[][] testResult = new int[testCnt][studentCnt];
    
    for (int i = 0; i < testCnt; i++) {
      for (int j = 0; j < studentCnt; j++) {
        testResult[i][j] = sc.nextInt();
      }
    }
    
    System.out.println(solution(studentCnt, testCnt, testResult));
  }
  
  public static int solution(int studentCnt, int testCnt, int[][] array) {
    int answer = 0;
    
    // 모든 학생들과 대조해 본다.
    for (int studentI = 1; studentI <= studentCnt; studentI++) {
      for (int studentJ = 1; studentJ <= studentCnt; studentJ++) {
        
        // i가 j보다 성적이 잘 나온 횟수
        int cnt = 0;
        for (int k = 0; k < testCnt; k++) {
          // i와 j의 등수
          int resultI = 0;
          int resultJ = 0;
          
          for (int s = 0; s < studentCnt; s++) {
            // i와 j의 등수 가져오기
            if (array[k][s] == studentI) resultI = s;
            if (array[k][s] == studentJ) resultJ = s;
          }
          
          // i가 j보다 등수가 앞선다면
          if (resultI < resultJ) cnt++;
        }
        
        // 모든 시험에서 등수가 앞섰다면
        if (cnt == testCnt) answer++;
      }
    }
    
    return answer;
  }
}