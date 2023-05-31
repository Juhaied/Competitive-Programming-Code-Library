import java.io.*;
import java.util.*;

public class Div2_94_B {
    static ArrayList<Integer> adj[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        adj = new ArrayList[n+1];
        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<m;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        int cnt = 0;

        while (true){
            boolean flag = true;

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 1;i<=n;i++){
                if(adj[i].size()==1){
                    flag = false;
                    list.add(i);
                    adj[i].clear();
                }
            }

            if(flag){
                break;
            }

            for(int i = 0;i<list.size();i++){
                for (int j = 1;j<=n;j++){
                    for (int k = 0;k<adj[j].size();k++){
                        if(adj[j].get(k)==list.get(i)){
                            adj[j].remove(k);
                        }
                    }
                }
            }
            cnt++;
        }

        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
