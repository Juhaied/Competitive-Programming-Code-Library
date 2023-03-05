import java.io.*;
import java.util.*;

public class DFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        Graph graph = new Graph(n);

        for(int i = 0;i<m;i++){
            graph.edge(in.nextInt(), in.nextInt());
        }
        graph.dfs(0);

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
            System.out.print(u+" ");
            for (int v: adj[u]) {
                if (!vis[v]) dfs(v);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}