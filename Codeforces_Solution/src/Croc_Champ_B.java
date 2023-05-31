import java.io.*;
import java.util.*;

public class Croc_Champ_B {
    static ArrayList<Integer> adj[];
    static boolean vis1[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(),m = in.nextInt();
        adj = new ArrayList[n+1];

        for (int i = 0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i = 0;i<m;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1;i<=n;i++){
            list.add(adj[i].size());
            set.add(adj[i].size());
        }

        if(set.size()==1 && set.contains(2)){
            pw.println("ring topology");
        }
        else {
            Collections.sort(list);

            int c1 = 0,c2= 0,c3 = 0,c4 = 0;

            for (int i = 0;i<list.size();i++){
                if(list.get(i)==1){
                    c1++;
                }
                else if(list.get(i)==2){
                    c2++;
                }
                else if(list.get(i)==m){
                    c4++;
                }
                else {
                    c3++;
                }
            }

            if(c3!=0){
                pw.println("unknown topology");
            }
            else if(c1==2 && n-c2==c1){
                pw.println("bus topology");
            }
            else {
                pw.println("star topology");
            }
        }

       // debug(list);


        pw.close();
    }




    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
