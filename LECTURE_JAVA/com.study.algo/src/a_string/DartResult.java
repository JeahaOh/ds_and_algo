package a_string;

public class DartResult {
  public static int solution(String dartResult) {
    int arr[] = new int[3];
    int idx = 0;
    String temp = "";
    int answer = 0;
    
    for (int i = 0; i < dartResult.length(); i++) {
      switch (dartResult.charAt(i)) {
        case '*' :
          arr[idx - 1] *=2;
          if (idx > 1) arr[idx - 2] *= 2;
          break;
        case '#' :
          arr[idx - 1] *= -1;
          break;
        case 'S' :
          arr[idx] = Integer.parseInt(temp);
          idx++;
          temp = "";
          break;
        case 'D' :
          arr[idx] = (int)Math.pow(Integer.parseInt(temp), 2);
          idx++;
          temp = "";
          break;
        case 'T' :
          arr[idx] = (int)Math.pow(Integer.parseInt(temp), 3);
          idx++;
          temp = "";
          break;
        default:
          temp += String.valueOf(dartResult.charAt(i));
          break;
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    String[] strs = {
            "1S2D*3T",
            "1D2S#10S",
            "1D2S0T",
            "1S*2T*3S",
            "1D#2S*3S",
            "1T2D3D#",
            "1D2S3T*"
    };
    for (String str : strs) {
      System.out.println(str + " : " + solution(str));
    }
  }
}