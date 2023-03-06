import java.io.*;
import java.util.*;

public class GraphExample {
    static ArrayList<Integer>[] adj;
    static Queue<Integer> queue;
    static int[] path;
    static boolean[] vis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        /*  1    1 + 1
        *   1 -  2
        *   \1 1    \
        *    4-5   7 1 +2 = 3
        *       |  / \
                3  8   9 1 + 3 = 4
                *-------|
                *
         */

        adj = new ArrayList[10];
        vis = new boolean[10];
        path = new int[10];
        for (int i = 0; i < 10; i++) adj[i] = new ArrayList<>();
        adj[1].add(2);
        adj[2].add(1);
        adj[1].add(4);
        adj[4].add(1);
        adj[4].add(5);
        adj[5].add(4);
        adj[2].add(7);
        adj[7].add(2);
        adj[7].add(8);
        adj[8].add(7);
        adj[7].add(9);
        adj[9].add(7);

        adj[5].add(3);
        adj[3].add(5);
        adj[3].add(9);
        adj[9].add(3);

        bfs(1);


        debug(path[9]);

        pw.close();
    }

    static void dfs(int u) {
       // debug(u);
        vis[u] = true;
        for (int v: adj[u]) {
            if (!vis[v]) dfs(v);
        }
    }

    static void bfs(int s) {
        queue = new LinkedList<>();
        queue.add(s);
        vis[s] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            //debug(u);
            for (int v: adj[u]) {
                if (!vis[v]) {
                    path[v] = path[u] + 1;
                    queue.add(v);
                    vis[v] = true;
                }
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
