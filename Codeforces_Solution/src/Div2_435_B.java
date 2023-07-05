import java.io.*;
import java.util.*;

public class Div2_435_B {
    static ArrayList<Integer>adj[];
    public  static long clr[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        clr = new long[2];
        adj = new ArrayList[n];

        for (int i = 0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<n-1;i++){
            int u = in.nextInt()-1, v = in.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }
        dfs(0,0,0);

        pw.println(clr[0]*clr[1]-(n-1));
        pw.close();
    }

    static void dfs(int node,int parent,int color){
        clr[color]++;

        for (int i :adj[node]){
            if(i!=parent){
                dfs(i,node,color==1?0:1);
            }
        }
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
