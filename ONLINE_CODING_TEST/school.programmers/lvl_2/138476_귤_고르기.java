import java.util.*;

class Solution {
    Map<Integer, Integer> sizeMap = new HashMap<>();
    
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 1. sizeMap data set (귤 사이즈별로 정리)
        for (int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0) + 1);
        }
        
        // 2. keyList 생성 (사이즈별 list)
        List<Integer> keyList = new ArrayList<>(sizeMap.keySet());
        
        // 3. keyList의 value 기준 내림차순 정렬 (사이즈를 사이즈별 총개수로 내림차순 정렬)
        Collections.sort(keyList, new TengerineComparator());
        
        // 4. k의 갯수만큼 상자에 담아 최소값 추출
        for (Integer i : keyList) {
            if (k <= 0) {
                break;
            }
            
            answer++;
            k -= sizeMap.get(i);
        }
        
        return answer;
    }
    
    public class TengerineComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer e1, Integer e2) {
            return sizeMap.get(e2).compareTo(sizeMap.get(e1));
        }
    }
}