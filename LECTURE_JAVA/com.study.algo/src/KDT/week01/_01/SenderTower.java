package KDT.week01._01;

class SenderTower {
    class Solution {
        public int solution(int n, int[] stations, int w) {
            // 기지국 설치 갯수
            int answer = 0;
            int stationIdx = 0;
            
            int position = 1;
            while (position <= n) {
                if (stationIdx < stations.length && stations[stationIdx] - w <= position) {
                    // 기지국의 전파범위 안에 있음
                    position = stations[stationIdx] + w + 1;
                    stationIdx++;
                } else {
                    // 기지국 설치
                    answer += 1;
                    position += (w * 2) + 1;
                }
            }
            return answer;
        }
    }
}
/**
 * 효율성 높이기
 * loop 개선
 * 적절한 DS 사용
 * 불필요한 object 제거
 */