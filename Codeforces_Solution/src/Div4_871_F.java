import java.io.*;
import java.util.*;

public class Div4_871_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i = 0;i<n+1;i++){
                adj.add(new ArrayList<>());
            }

            for(int i= 0;i<m;i++){
                int u = in.nextInt();
                int v = in.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }



            int x = -1,y = -1;
            boolean flag = false;

            for(int i = 1;i<=n;i++){
                if(adj.get(i).size()==1){
                    int parent = adj.get(i).get(0);
                    y = adj.get(parent).size()-1;

                    for(int ind:adj.get(parent)){
                        x = Math.max(x,adj.get(ind).size());
                    }
                    flag =true;
                    break;
                }
            }

            pw.println(x+" "+y);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
