import java.io.*;
import java.util.*;

public class Detect_Cycle_In_Undirected_Graph_BFS {

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
    static class Pair implements Comparable<Pair> {
        int p, t;
        Pair(int p, int t) {
            this.p = p;
            this.t = t;
        }


        @Override
        public int compareTo(Pair o) {
            if (this.p == o.p) {
                if (this.t > o.t) return 1;
                else return -1;
            } else {
                if (this.p < o.p) return 1;
                else return -1;
            }
        }

        @Override
        public String toString() {
            return "[" + p + " " + t + "]";
        }
    }

    public static boolean cycle_Check_BFS(int U,int n,ArrayList<Integer>[]adj){
        visited[U] = true;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(U,-1));
        while (!q.isEmpty()){
            int node = q.peek().p;
            int parent  = q.peek().t;
            q.remove();

            for (int V: adj[node]){
                if(!visited[V]){
                    visited[V] = true;
                    q.add(new Pair(V,node));
                }
                else if(parent!=V){
                    return  true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V,ArrayList<Integer>[] adj){
        for (int i = 0;i<V;i++){
            if(!visited[i]){
                if(cycle_Check_BFS(i,V,adj))return true;
            }
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
