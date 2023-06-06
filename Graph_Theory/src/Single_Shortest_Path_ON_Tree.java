import java.io.*;
import java.util.*;

public class Single_Shortest_Path_ON_Tree {
    static ArrayList<Integer> adj[];
    static boolean visited[];
    static int distance[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];
        distance = new int[n+1];

        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<n-1;i++){
            int u = in.nextInt(), v = in.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1,0);

        //debug(distance);

        int query = in.nextInt();
        int min = Integer.MAX_VALUE,index = 0;
        for (int i = 0;i<query;i++){
            int ind = in.nextInt();

            if(min>distance[ind]){
                min = distance[ind];
                index = i+1;
            }
        }

        pw.println(index);
        pw.close();
    }

    static void dfs(int u,int d){
        visited[u] = true;
        distance[u]  =d;

        for (int v:adj[u]){
            if(!visited[v]){
                dfs(v,distance[u]+1);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
