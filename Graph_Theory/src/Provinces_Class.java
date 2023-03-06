import java.io.*;
import java.util.*;

public class Provinces_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(),edges = in.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0;i<edges;i++){
            int u = in.nextInt(),v = in.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n+1];
        debug(findCircleNum(adj,vis)-1);
        pw.close();
    }

    public static int findCircleNum(ArrayList<ArrayList<Integer>>adj,boolean vis[]) {

        int cnt = 0;

        for(int i = 0;i<adj.size();i++){
            if(vis[i] == false){
                vis[i] =true;
                cnt++;
                dfs(adj,i,vis);
            }
        }

        return cnt;
    }
    static  void dfs(ArrayList<ArrayList<Integer>> adj,int src,boolean[] vis)
    {
        int c = 0;
        vis[src] = true;

        for(int it : adj.get(src))
        {
            if(vis[it] == false) {
                vis[it] = true;
                dfs(adj, it, vis);
            }
        }

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
