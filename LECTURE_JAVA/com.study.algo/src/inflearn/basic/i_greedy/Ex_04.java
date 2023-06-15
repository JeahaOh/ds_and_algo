package inflearn.basic.i_greedy;

import java.util.*;

/**
 * 최대 수입 스케쥴(PriorityQueue 응용)
 */
public class Ex_04 {
    final static class Lecture implements Comparable<Lecture> {
        public int money;
        public int date;
    
        Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }
        
        @Override
        public int compareTo(Lecture ob) {
            return ob.date - this.date;
        }
    }
    
    static int n, max = Integer.MIN_VALUE;
    
    public int solution(List<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).date < i) break;
                
                pq.offer(arr.get(j).money);
            }
            
            if (!pq.isEmpty()) answer += pq.poll();
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Ex_04 T = new Ex_04();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Lecture> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            arr.add(new Lecture(money, date));
            if (date > max) max = date;
        }
        
        System.out.println(T.solution(arr));
    }
}
