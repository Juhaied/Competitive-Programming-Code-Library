import java.io.*;
import java.util.*;

public class Div2_215_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        int a[] = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        int dis[] = new int[n];
        for(int i = n-1;i>=0;i--){
            set.add(a[i]);
            dis[i] = set.size();
        }

        for(int i=0;i<m;i++){
            int ind = in.nextInt()-1;
            pw.println(dis[ind]);
        }



        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
