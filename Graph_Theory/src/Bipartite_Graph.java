import java.io.*;
import java.util.*;

public class Bipartite_Graph {
    static ArrayList<Integer> adj[];
    static int color[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        adj = new ArrayList[n+1];

        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        color = new int[n+1];

        for (int i = 0;i<m;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        Arrays.fill(color,-1);



        if(isBipartite(n)){
            pw.println("Bipartite");
        }
        else {
            pw.println("Not Biprtite");
        }
        //debug(color);
        pw.close();
    }
    static boolean isBipartite(int n){
        for (int i = 0;i<n;i++){
            if(color[i]==-1){
                if(check(i,n)==false){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check(int start,int n){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        color[start] = 0;
        while (!q.isEmpty()){
            int u = q.poll();

            for (int v:adj[u]){
                if(color[v]==-1){
                    color[v] = 1 - color[u];
                    q.add(v);
                }

                else if(color[u]==color[v]){
                    return false;
                }
            }
        }
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
