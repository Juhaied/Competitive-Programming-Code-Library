import java.io.*;
import java.util.*;

public class Vk_Cup_2017_A {
    static int edges;
    static int vertices;
    static ArrayList<Integer>[] adjL;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        adjL = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjL[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1, v = in.nextInt() - 1;
            adjL[u].add(v);
            adjL[v].add(u);
        }
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i])
                dfs(i, vis);
            if (edges != 1l * (vertices - 1) * vertices / 2) {
                System.out.print("NO");
                return;
            }
            edges = 0;
            vertices = 0;
        }
        pw.println("YES");
        pw.close();
    }
    public static void dfs(int u, boolean[] vis) {
        vis[u] = true;
        vertices++;
        for (int v : adjL[u]) {
            if (!vis[v]) {
                dfs(v, vis);
            }
            if (v > u)
                edges++;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
