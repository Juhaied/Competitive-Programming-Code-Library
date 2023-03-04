import java.io.*;
import java.util.*;

public class Representation_0Based{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int nodes  = in.nextInt(),edges = in.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0;i<nodes;i++){
            adj.add(new ArrayList<>());
        }


        for(int i = 0;i<edges;i++){
            int u = in.nextInt(), v = in.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i = 0;i<nodes;i++){
            pw.print("Adjacency List of "+i+" : ");
            for (int j = 0;j<adj.get(i).size();j++){
                pw.print(adj.get(i).get(j)+" ");
            }
            pw.println();
        }


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
