import java.io.*;
import java.util.*;

public class Div4_827_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), query = in.nextInt();

            long a[] = new long[n+1];
            long heights[] = new long[n+1];
            heights[0] = 0;
            for (int i = 1;i<=n;i++){
                int val = in.nextInt();
                heights[i] = heights[i-1]+val;
                a[i] = Math.max(val,a[i-1]);
            }

            for (int i = 0;i<query;i++){
                int q = in.nextInt();
                pw.print(heights[solve(a,q,n)]+" ");
            }
            pw.println();
        }
        pw.close();
    }

    static int solve(long a[],int k,int n){
        int l = 0, r = n;
        while (l<=r){
            int mid = (l+r)/2;

            if(a[mid]<=k){
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return r;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
