import java.io.*;
import java.util.*;

public class Div3_881_D {
    static ArrayList<Integer> adj[];
    static boolean visited[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            adj = new ArrayList[n+1];
            visited = new boolean[n+1];
            for (int i = 0;i<=n;i++){
                adj[i]  = new ArrayList<>();
            }

            for (int i = 0;i<n-1;i++){
                int u = in.nextInt(), v = in.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }

            long leaf[] = new long[n+1];

            dfs(1,-1,leaf);

            int q = in.nextInt();

            for (int i = 0;i<q;i++){
                int x = in.nextInt(), y = in.nextInt();

                pw.println(leaf[x]*leaf[y]);
            }

            debug(leaf);
        }
        pw.close();
    }

    static void dfs(int v,int parent ,long leaf[]){
        for (int u : adj[v]){
            if(u !=parent){
                dfs(u,v,leaf);
                leaf[v]+=leaf[u];
            }
        }

        if(leaf[v]==0){
            leaf[v]=1;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
