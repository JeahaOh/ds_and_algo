package KDT.week01._01;

class BicycleFactory {
    
    class Solution {
        public int solution(int[][] cost, int[][] order) {
            int answer = 0;
            
            int maxMonth = 0;
            for (int[] o : order) maxMonth = Math.max(maxMonth, o[0]);
            
            int[] monthlyOrder = new int[maxMonth];
            int need = 0;
            int made = 0;
            for (int[] o : order) {
                // order is not sorted!
                monthlyOrder[o[0] - 1] += o[1];
                need += o[1];
            }
            
            for (int i = 0; i < cost.length - 1; i++) {
                if (need == 0 || made >= need) break;
                
                int price = cost[i][1];
                int limit = cost[i + 1][0] - cost[i][0];
                int rest = 0;
                
                for (int j = 0; j < maxMonth; j++) {
                    if (need == 0 || made >= need) break;
                    
                    int making = Math.min(limit, need - made);
                    
                    answer += making * price;
                    made += making;
                    need -= monthlyOrder[j];
                    
                    // not need to supply
                    if (monthlyOrder[j] == 0) continue;
                    
                    int delivery = Math.min(made, monthlyOrder[j]);
                    
                    // supply from pre-made
                    made -= delivery;
                    monthlyOrder[j] -= delivery;
                    rest += monthlyOrder[j];
                }
                
                need = rest;
                made = 0;
            }
            
            // latest range price
            answer += need * cost[cost.length - 1][1];
            return answer;
        }
    }
}
