package KDT.week04;

import java.util.*;


public class PrerequisiteClassTree {
    // String : List<String> 맵 유틸
    private final static class ListMap {
        private final Map<String, List<String>> map = new HashMap<>();
        
        List<String> get(String key) {
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            return map.get(key);
        }
        
        void append(String key, String value) {
            get(key).add(value);
        }
    }
    
    // String : Integer 맵 유틸
    private final static class CountMap {
        private final Map<String, Integer> map = new HashMap<>();
        
        Integer get(String key) {
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
            return map.get(key);
        }
        
        void add(String key, Integer value) {
            map.put(key, get(key) + value);
        }
    }
    
    public static String[] solution(String[] s1, String[] s2, String k) {
        // 연결 그래프 생성
        ListMap graph = new ListMap();
        for (int i = 0; i < s1.length; i++) {
            graph.get(s2[i]).add(s1[i]); // 강의 -> 선수강의
        }
        
        Queue<String> queue = new PriorityQueue<>(); // 알파벳 순서대로 정렬되는 큐
        ListMap graphK = new ListMap(); // K로 연결되는 강의로만 구성하는 그래프
        CountMap indegrees = new CountMap(); // 강의:진입차수
        
        // DFS 방식으로 graphK 를 생성
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        stack.push(k);
        visited.add(k);
        
        while (!stack.isEmpty()) {
            String node = stack.pop();
            
            if (graph.get(node).isEmpty()) {
                // 진입차수가 없는 강의를 먼저 큐에 삽입
                queue.offer(node);
                continue;
            }
            
            for (String prev : graph.get(node)) {
                indegrees.add(node, 1); // 진입차수 증가
                graphK.append(prev, node);
                if (visited.contains(prev)) continue;
                stack.push(prev);
                visited.add(prev);
            }
        }
        
        List<String> answer = new ArrayList<>();
        while (!queue.isEmpty()) {
            String node = queue.poll();
            answer.add(node);
            for (String next : graphK.get(node)) {
                indegrees.add(next, -1);
                if (indegrees.get(next) == 0) {
                    // 감소된 진입차수가 0이면 큐에 삽입
                    queue.offer(next);
                }
            }
        }
        
        return answer.toArray(String[]::new);
    }
    
    public static void main(String[] args) {
        String[] s1 = new String[]{"A", "E", "B", "D", "B", "H", "F", "H", "C"};
        String[] s2 = new String[]{"G", "C", "G", "F", "J", "E", "B", "F", "B"};
        String k = "B";
        String[] expect = new String[]{"D", "H", "E", "C", "F", "B"};
        String[] result = solution(s1, s2, k);
        
        System.out.println("Arrays.equals(expect, result) : " + Arrays.equals(expect, result));
        System.out.println(Arrays.toString(result));
        
        s1 = new String[]{"A", "E", "B", "D", "B", "H", "F", "H", "C"};
        s2 = new String[]{"G", "C", "G", "F", "J", "E", "B", "F", "B"};
        k = "G";
        expect = new String[]{"A", "D", "H", "E", "C", "F", "B", "G"};
        result = solution(s1, s2, k);
        
        System.out.println("Arrays.equals(expect, result) : " + Arrays.equals(expect, result));
        System.out.println(Arrays.toString(result));
    }
}
