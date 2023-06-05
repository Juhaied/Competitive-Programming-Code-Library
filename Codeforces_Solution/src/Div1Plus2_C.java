import java.io.*;
import java.util.*;

public class Div1Plus2_C {
    static ArrayList<Integer> adj[];
    static boolean visited[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            adj = new ArrayList[s.length()+1];
            visited = new boolean[s.length()+1];
            for (int i = 0;i<=s.length();i++){
                adj[i] = new ArrayList<>();
            }

            Stack<Character> stk = new Stack<>();

            ArrayList<Integer> index = new ArrayList<>();
            adj[1].add(s.length());
            adj[s.length()].add(1);
            for (int i = 0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    stk.push('(');
                    index.add(i+1);
                }
                else {
                    stk.pop();
                    int u = i+1;
                    int v = index.remove(index.size()-1);
                    adj[u].add(v);
                    adj[v].add(u);
                }
            }

            for (int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)==')' && s.charAt(i+1)=='('){
                    adj[i+1].add(i+2);
                    adj[i+2].add(i+1);
                }
            }

            int cnt  = 0;

            for (int i = 1;i<=s.length();i++){
                if(!visited[i]){
                    cnt++;
                    dfs(i);
                }
            }

            pw.println(cnt);

         //   debug(adj);
        }
        pw.close();
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
