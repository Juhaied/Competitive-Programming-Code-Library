import java.io.*;
import java.util.*;

public class Div2_669_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();
            boolean vis[] = new boolean[n];

            int d = 0;
           // debug(vis);
            for(int i = 0;i<n;i++){
                int ind = 0,max = 0;
                for(int j = 0;j<n;j++){
                  if(!vis[j] && gcd(d,a[j])>max){
                      max = gcd(d,a[j]);
                      ind = j;
                  }
                }

                d = max;
                vis[ind] = true;

                ans.add(a[ind]);

            }
            for (int i = 0;i<ans.size();i++){
                pw.print(ans.get(i)+" ");
            }
            pw.println();
        }
        pw.close();
    }
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;

        else
            return gcd(b,a%b);
    }

    static int[] collections_toArray(ArrayList<Integer> list){
        int a[] = new int[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
