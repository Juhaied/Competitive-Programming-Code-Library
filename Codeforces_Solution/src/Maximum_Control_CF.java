import java.io.*;
import java.util.*;

public class Maximum_Control_CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        Graph graph = new Graph(n);
        for(int i = 1;i<=n-1;i++){
            int u = in.nextInt(),v = in.nextInt();
            graph.edge(u,v);
        }
        int cnt = 0;
        for(int i = 1;i<=n;i++){
            if(graph.adj[i].size()==1){
                cnt++;
            }
        }

        pw.println(cnt);

        pw.close();
    }
    static class Graph {
        ArrayList<Integer>[] adj;
        boolean[] vis;
        int N;

        Graph(int N) {
            adj = new ArrayList[N + 5];
            for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
            vis = new boolean[N + 5];
        }

        public void edge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        public void dfs(int u) {
            vis[u] = true;
            // System.out.print(u+" ");
            for (int v: adj[u]) {
                if (!vis[v]) dfs(v);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
