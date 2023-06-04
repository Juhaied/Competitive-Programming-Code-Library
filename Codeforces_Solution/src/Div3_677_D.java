import java.io.*;
import java.util.*;

public class Div3_677_D {
    static boolean visited[];
    static ArrayList<Integer> adj[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            visited = new boolean[n];
            adj = new ArrayList[n + 1];
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                //set.add(a[i]);
            }
            int second = -1;

            for (int i = 0;i<n;i++){
                if(a[0]!=a[i]){
                    second = i;
                    break;
                }
            }
            if (second==-1){
                pw.println("NO");
            }
            else {
                StringBuilder sb = new StringBuilder();
                pw.println("YES");
                for (int i = 1;i<n;i++){
                    if(a[i]!=a[0]){
                        sb.append(1+" "+(i+1)+"\n");
                    }
                    else {
                        sb.append((i+1)+" "+(second+1)+"\n");
                    }
                }

                pw.println(sb);
            }


        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
