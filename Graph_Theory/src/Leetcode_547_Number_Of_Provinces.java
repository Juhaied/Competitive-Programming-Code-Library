import java.io.*;
import java.util.*;

public class Leetcode_547_Number_Of_Provinces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a[][] = {{1,1,0},{1,1,1},{0,1,1}};
        debug(findCircleNum(a));
        pw.close();
    }
    public static int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        for(int i=0;i<n;i++)
            adj.add(new ArrayList());

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == j)
                    continue;
                if(isConnected[i][j] == 1)
                    adj.get(i).add(j);
            }
        }
        int ans = 0;
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i] == false)
            {
                ans++;
                dfs(adj,i,vis);
            }
        }
        return ans;
    }
    static  void dfs(List<List<Integer>> adj,int src,boolean[] vis)
    {
        vis[src] = true;

        for(int it : adj.get(src))
        {
            if(vis[it] == false)
                dfs(adj,it,vis);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
