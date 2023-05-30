import java.io.*;
import java.util.*;

public class Connected_Components {
    static ArrayList<Integer> adj[];
    static boolean visited[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        int cnt  = 0;

        for (int i = 0;i<m;i++){
            int u = in.nextInt() , v = in.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }


        for (int i  =1;i<=n;i++){
            if (!visited[i]){
                cnt++;
                dfs(i);
            }
        }

        pw.println(cnt);


        pw.close();
    }

    public static void dfs(int u) {
        visited[u] = true;

        for (int v: adj[u]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
