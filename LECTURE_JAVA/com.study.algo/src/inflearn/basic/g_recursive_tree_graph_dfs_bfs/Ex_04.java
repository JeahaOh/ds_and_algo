package inflearn.basic.g_recursive_tree_graph_dfs_bfs;

// 재귀를 이용한 피보나치 수열
// 재귀 방식은 stack을 사용하기 때문에 큰수에 대해 비효율적임
// 배열에 담아 반환하는 것을 메모이제이션이라고 함
public class Ex_04 {
    static int[] fibo;
    public static int dfs(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        //int n = 10;
        //int n = 45;
        fibo = new int[n + 1];
        System.out.println(dfs(n));
        
        for (int i = 1; i <= n; i++) {
          System.out.print(fibo[i] + " ");
        }
    }
}