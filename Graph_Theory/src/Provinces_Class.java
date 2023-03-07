import java.io.*;
import java.util.*;

public class Provinces_Class {
    static  boolean vis[];
    static ArrayList<Integer> []adj;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(),edges = in.nextInt();
        adj =new ArrayList[n+1];
        for(int i = 0;i<=n;i++){
           adj[i] =new ArrayList<>();
        }

        for(int i = 0;i<edges;i++){
            int u = in.nextInt(),v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        vis = new boolean[n+1];

        pw.println(findCircleNum());
        pw.close();
    }

    public static int findCircleNum() {

        int cnt = 0;

        for(int i = 1;i<vis.length;i++){
            if(vis[i] == false){
                //vis[i] =true;
                cnt++;
                dfs(i);
            }
        }

        return cnt;
    }
    static void dfs(int u) {
        // debug(u);
        vis[u] = true;
        for (int v: adj[u]) {
            if (!vis[v]) dfs(v);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
