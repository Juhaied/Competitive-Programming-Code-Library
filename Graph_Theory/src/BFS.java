import java.io.*;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int nodes  = in.nextInt(),edges = in.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //if 1 based indexing
        for (int i = 0;i<=nodes;i++){
            adj.add(new ArrayList<>());
        }


        for(int i = 0;i<edges;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        debug(adj);

        debug(bfs(0,nodes+1,adj));
        pw.close();
    }

    public  static  ArrayList<Integer> bfs(int start,int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> traversal = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new ArrayDeque<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()){
           start = q.poll();
           traversal.add(start);
            Iterator<Integer> i = adj.get(start).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // if the adjacent vertex n is not visited, mark it visited and enqueue it
                if (!vis[n]) {
                    vis[n] = true;
                    q.add(n);
                }
            }
        }

        return traversal;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
