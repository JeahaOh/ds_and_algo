class Solution {
    public int solution(int[][] dots) {
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) {
            return 1;
        }
        
        if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            return 1;
        }
        
        if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            return 1;
        }
        
        return 0;
    }

    /**
     * 선(두 점)의 기울기를 구하는 공식
     * 기울기 = (y2 - y1) / (x2 - x1)
     */
    public double getSlope(int[] point1, int[] point2) {
        int y = (point2[1] - point1[1]);
        int x = (point2[0] - point1[0]);
        return (double) y / x;
    }
}