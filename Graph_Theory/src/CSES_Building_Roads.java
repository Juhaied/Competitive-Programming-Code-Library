import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CSES_Building_Roads {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int n ,m;
    static ArrayList<Integer> adj[];
    static  boolean visited[];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        n = readInt();
        m = readInt();

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0;i<m;i++){
            int u = readInt(),v = readInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(!visited[i]){
                l.add(i);
                dfs(i);
                cnt++;
            }
        }
        pw.println(cnt-1);

        for (int  i = 1;i< l.size();i++){
            pw.print(l.get(i-1)+" "+l.get(i));
            pw.println();
        }

        pw.close();
    }

    static String next()throws  IOException{
        while (st==null|| !st.hasMoreTokens())
            st=new StringTokenizer(br.readLine().trim());

        return st.nextToken();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(next());
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
