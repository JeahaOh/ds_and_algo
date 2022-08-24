import java.util.Arrays;

// class Solution {
//   public static int solution(int n, int[] lost, int[] reserve) {
//     int answer = n - lost.length;
    
//     Arrays.sort(lost);
//     Arrays.sort(reserve);
    
//     // 여벌을 도난
//     for (int i = 0; i < lost.length; i++) {
//       for (int j = 0; j < reserve.length; j++) {
//         if (lost[i] == reserve[j]) {
//           answer++;
//           lost[i] = -1;
//           reserve[j] = -1;
//           break;
//         }
//       }
//     }
    
//     // 빌려줌
//     for (int i = 0; i < lost.length; i++) {
//       for (int j = 0; j < reserve.length; j++) {
//         // 앞이나 뒤에만 빌려줄 수 있음
//         if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
//           answer++;
//           reserve[j] = -1;
//           break;
//         }
//       }
//     }
    
//     return answer;
//   }
// }


//  public static int solution(int n, int[] lost, int[] reserve) {
//    int[] people = new int[n];
//    int answer = n;
//
//    for (int l : lost)
//      people[l - 1]--;
//    for (int r : reserve)
//      people[r - 1]++;
//
//    for (int i = 0; i < people.length; i++) {
//      if (people[i] == -1) {
//        if (i - 1 >= 0 && people[i - 1] == 1) {
//          people[i]++;
//          people[i - 1]--;
//        } else if (i + 1 < people.length && people[i + 1] == 1) {
//          people[i]++;
//          people[i + 1]--;
//        } else
//          answer--;
//      }
//    }
//    return answer;
//  }