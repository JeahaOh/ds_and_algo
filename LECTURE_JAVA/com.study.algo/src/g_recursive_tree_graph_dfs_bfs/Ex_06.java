package g_recursive_tree_graph_dfs_bfs;

/**
 * 부분 집합 구하기 (DFS)
 *
 * 자연수 N이 주어지면
 * 1부터 N까지 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램 작성
 *
 * 입력 :
 *      N(1 <= N <= 10)
 * 출력 :
 *      첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래 출력예제와 같은 순서로 출력한다.
 *      단, 공집합은 출력하지 않는다.
 *
 * 입력 예제 : 1
 * 출력 예제 :
 *          1 2 3
 *          1 2
 *          1 3
 *          1
 *          2 3
 *          2
 *          3
 *
 * 미친 뭔소린지 하나도 모르겠다
 */
public class Ex_06 {
    static int N;
    static int[] CH;
    
    public static void dfs(int L) {
        if (L == N + 1) {
            String tmp = "";
            for (int i = 1; i <= N; i++) {
                if (CH[i] == 1) tmp += (i + " ");
            }
            
            if (tmp.length() > 0) System.out.println(tmp);
        
        } else {
            CH[L] = 1;
            dfs(L + 1);
            
            CH[L] = 0;
            dfs(L + 1);
        }
    }
    
    public static void main(String[] args) {
        Ex_06 instance = new Ex_06();
        N = 3;
        CH = new int[N + 1];
        instance.dfs(1);
    }
}