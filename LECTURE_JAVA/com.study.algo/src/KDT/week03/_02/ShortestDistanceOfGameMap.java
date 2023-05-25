package KDT.week03._02;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceOfGameMap {
    class Position {
        int x, y;
        
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        boolean isValid(int width, int height) {
            if (x < 0 || x >= width) return false;
            if (y < 0 || y >= height) return false;
            
            return true;
        }
    }
    
    public int solution(int[][] maps) {
        // BFS : Queue
        
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;
        Queue<Position> queue = new LinkedList<>();
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];
        
        queue.offer(new Position(0, 0));
        count[0][0] = 1;
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            Position curr = queue.poll();
            
            int currentCount = count[curr.y][curr.x];
            
            // 4 가지 경우
            final int[][] moving = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            
            for (int i = 0; i < moving.length; i++) {
                Position moved = new Position(curr.x + moving[i][0], curr.y + moving[i][1]);
                
                if (!moved.isValid(mapWidth, mapHeight)) continue;
                if (visited[moved.y][moved.x]) continue;
                if (maps[moved.y][moved.x] == 0) continue; // 0 : 벽, 1 : 길
                
                count[moved.y][moved.x] = currentCount + 1;
                visited[moved.y][moved.x] = true;
                queue.offer(moved);
            }
        }
        
        int answer = count[mapHeight - 1][mapWidth - 1];
        if (answer == 0) return -1;
        
        return answer;
    }
    
    public static void main(String[] args) {
        int[][] maps = {
                {
                        1, 0, 1, 1, 1
                },
                {
                        1, 0, 1, 0, 1
                },
                {
                        1, 0, 1, 1, 1
                },
                {
                        1, 1, 1, 0, 1
                },
                {
                        0, 0, 0, 0, 1
                }
        };
        
        ShortestDistanceOfGameMap instance = new ShortestDistanceOfGameMap();
        System.out.println(instance.solution(maps));
        
        maps = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };
        System.out.println(instance.solution(maps));
        
    }
}
