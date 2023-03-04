package do_it.chap02._07;

// 1,000 이하의 소수 나열 I
public class PrimeNumber1 {
    public static void main(String[] args) {
        // 나눗셈 횟수
        int counter = 0;
        
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                // 나누어 떨어지면 소수가 아님, 반복 불필요
                if (n % i == 0) break;
            }
            
            // 나누어 떨어지지 않음
            if (n == i)
                System.out.println(n);
        }
        
        System.out.println("division count : " + counter);
    }
}
