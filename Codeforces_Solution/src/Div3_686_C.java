import java.io.*;
import java.util.*;

public class Div3_686_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt()-1;
            }
            ArrayList<Integer>[] occs=new ArrayList[n];
            for (int i=0; i<n; i++) {
                occs[i]=new ArrayList<>();
            }
            for (int i=0; i<n; i++) {
                occs[a[i]].add(i);
            }
            int best=Integer.MAX_VALUE;
            for (ArrayList<Integer> aa:occs) {
                best=Math.min(best, tryCount(aa, n));
            }
            System.out.println(best);

        }
        pw.close();
    }
    static int tryCount(ArrayList<Integer> a, int n) {
        if (a.isEmpty()) return Integer.MAX_VALUE;
        int count=0;
        for (int i=0; i+1<a.size(); i++) if (a.get(i)+1!=(int)a.get(i+1)) count++;
        if (a.get(0)!=0) count++;
        if (a.get(a.size()-1)!=n-1) count++;
        return count;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
