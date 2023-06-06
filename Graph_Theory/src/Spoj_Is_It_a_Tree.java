import java.io.*;
import java.util.*;

public class Spoj_Is_It_a_Tree {
    static ArrayList<Integer> adj[];
    static boolean visited[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];


        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<n-1;i++){
            int u = in.nextInt(), v = in.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }
        int cnt  = 0;
        for (int i = 1;i<=n;i++){
            if(!visited[i]){
                cnt++;
                dfs(i);
            }
        }

        if(cnt==1 && n-m ==1){
            pw.println("YES");
        }
        else {
            pw.println("NO");
        }


        pw.close();
    }

    static void dfs(int u){
        visited[u] = true;

        for (int v:adj[u]){
            if(!visited[v]){
                dfs(v);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
