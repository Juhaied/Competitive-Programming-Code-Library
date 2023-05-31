import java.io.*;
import java.util.*;

public class Detect_Cycle_In_Undirected_Graph_DFS {

    static ArrayList<Integer> adj[];
    static boolean visited[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        adj = new ArrayList[n+1];
        visited  = new boolean[n+1];
        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<m;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        if(isCycle(n,adj)){
            System.out.println("Cycle");
        }
        else {
            pw.println("Not Cycle");
        }

        pw.close();
    }

    public static boolean cycle_Check_DFS(int U,int parent,ArrayList<Integer>[]adj){
        visited[U] = true;
        for (int V:adj[U]){
            if(!visited[U]){
                if(cycle_Check_DFS(V,U,adj)){
                    return true;
                }
            }
            else if(V!=parent) return true;
        }
        return false;
    }

    public static boolean isCycle(int V,ArrayList<Integer>[] adj){
        for (int i = 0;i<V;i++){
            if(!visited[i]){
                if(cycle_Check_DFS(i,-1,adj))return true;
            }
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
