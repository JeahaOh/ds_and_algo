package KDT.week01._04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlipCoins {
    static int solution(int[] coin, int k) {
        // 동전이 하나면 뒤집을 필요 없음
        if (coin.length == 1) return 0;
        
        int sum = IntStream.of(coin).sum();
        // 모두 0이면 sum은 0, 모두 1일때 sum은 coin.length, 뒤집을 필요 없음
        if (sum == 0 || sum == coin.length) return 0;
        // 불가능
        if (sum != k && coin.length == k) return -1;
        
        // 원본 배열의 복사본을 전달한다
        // 모두 0으로 만들 경우
        int makeAll0 = flipCoins(Arrays.copyOf(coin, coin.length), k, 0);
        // 모두 1로 만들 경우
        int makeAll1 = flipCoins(Arrays.copyOf(coin, coin.length), k, 1);
        
        int answer = Math.min(makeAll0, makeAll1);
        if (answer == Integer.MAX_VALUE) return -1;
        
        return answer;
    }
    
    static int flipCoins(int[] coin, int k, int t) {
        int result = 0;
        
        for (int i = 0; i < coin.length - k + 1; i++) {
            // 원하는 값인 경우 skip
            if (coin[i] == t) continue;
            
            for (int j = 0; j < k; j++) {
                // 뒤집기
                coin[i + j] = 1 - coin[i + j];
            }
            
            result++;
        }
        
        int count = 0;
        // 원하는 값의 갯수 새기
        for (int c : coin) if (c == t) count++;
        
        if (count == coin.length) return result;
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0, 1, 1, 0, 1, 1}, 3));
        System.out.println(solution(new int[] {1, 0, 1}, 3));
        System.out.println(solution(new int[] {0, 0, 1, 1, 0, 0}, 2));
    }
}
