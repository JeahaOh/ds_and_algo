package do_it.chap02._08;

/**
 * 1,000 이하의 소수 나열 II
 * 같은 답을 얻는 알고리즘은 하나로 한정되지 않음.
 * 빠른 알고리즘은 메모리를 많이 필요로 하는 경향이 있음.
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        // 나눗셈 횟수
        int counter = 0;
        // 찾은 소수의 갯수
        int ptr = 0;
        // 소수를 저장하는 배열
        int[] prime = new int[500];
        
        // 2는 소수임
        prime[ptr++] = 2;
        
        // 조사 대상은 홀수만
        for (int n = 3; n <= 1000; n += 2) {
            int i;
            // 이미 찾은 소수로 나눔
            for (i = 1; i < ptr; i++) {
                counter++;
                // 나누어 떨어지면 소수가 아님, 반복 불필요
                if (n % prime[i] == 0) break;
            }
            
            // 나누어 떨어지지 않음
            if (ptr == i)
                // 소수 배열에 저장
                prime[ptr++] = n;
        }
        
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        
        System.out.println("division count : " + counter);
    }
}
