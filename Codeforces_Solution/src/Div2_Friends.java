import java.io.*;
import java.util.*;

public class Div2_Friends {
    static ArrayList<Integer> adj[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        adj = new ArrayList[6];
        for (int i = 0;i<6;i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0;i<n;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean flag = false;

        for (int i = 1;i<=5;i++){
            if(adj[i].size()!=2){
                flag = true;
                break;
            }
        }

        if(flag){
            pw.println("WIN");
        }
        else {
            pw.println("FAIL");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
