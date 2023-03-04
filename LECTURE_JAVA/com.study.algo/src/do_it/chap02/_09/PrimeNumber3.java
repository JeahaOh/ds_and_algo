package do_it.chap02._09;

/**
 * 1,000 이하의 소수 나열 III
 * 정수 n은 n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는다면 소수다.
 */
public class PrimeNumber3 {
    public static void main(String[] args) {
        // 나눗셈의 횟수
        int counter = 0;
        // 찾은 소수의 갯수
        int ptr = 0;
        // 소수를 저장하는 배열
        int[] prime = new int[500];
        
        // 2, 3 은 소수임
        prime[ptr++] = 2;
        prime[ptr++] = 3;
        
        // 조사 대상은 홀수만
        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;
            
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                // prime[i] * prime[i] <= n 가 성립하지 않으면
                // 수행 횟수를 셀 수 없음
                counter += 2;
                
                // 나누어 떨어지면 소수가 아님, 반복 불필요.
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            
            // 마지막까지 나누어 떨어지지 않음, 소수로 배열에 저장.
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }
        
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
    
        System.out.println("division count : " + counter);
    }
}
