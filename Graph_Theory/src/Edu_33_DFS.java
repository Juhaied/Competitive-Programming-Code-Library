import java.io.*;
import java.util.*;

public class Edu_33_DFS {
    static  ArrayList<Integer>[] adj;
    static  boolean[] visited;
    static long cost;
    static  long[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        adj = new ArrayList[n+1];
        arr = new long[n];

        for(int i = 0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<n;i++){
            arr[i] = in.nextLong();
        }

        for(int i = 0;i<m;i++){
            int u = in.nextInt()-1,v = in.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }

        long sum = 0;

        visited = new boolean[n];

        for (int i = 0;i<n;i++){
            cost = Long.MAX_VALUE;
            if(!visited[i]){
                dfs(i);
                sum+=cost;
            }
        }

        pw.println(sum);

        pw.close();
    }
    static public void dfs(int u) {
        visited[u] = true;
        // System.out.print(u+" ");
        cost = Math.min(cost,arr[u]);
        //  debug(cost+" "+u);
        for (int v: adj[u]) {
            if (!visited[v]) dfs(v);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
