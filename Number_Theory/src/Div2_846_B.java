import java.io.*;
import java.util.*;

public class Div2_846_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long sum = 0;
            long max = -1;

            long ara[] = new long[n];
            for (int i = 0;i<n;i++){
                long x = in.nextLong();
                ara[i]= x;
                sum+=x;
                max = Math.max(max,x);
            }

            long pref[] = new long[n];
            pref[0] = ara[0];

            for (int i = 1;i<n;i++){
                pref[i] = pref[i-1]+ara[i];
            }

            //debug(pref);
            long ans = 1;
            for (int i = 0;i<n-1;i++){
                long Gcd = gcd(pref[i],sum-pref[i] );
                ans = Math.max(ans,Gcd);
            }
            pw.println(ans);
        }
        pw.close();
    }
    public static long gcd(long a, long b)
    {
        if(b == 0)
            return a;

        else
            return gcd(b,a%b);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
