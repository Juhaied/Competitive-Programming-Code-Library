import java.io.*;
import java.util.*;

public class Div2_870_B {
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

            long gcd = Math.abs(a[0]-a[n-1]);

            for(int i = 1;i<n/2;i++){
                long abs = Math.abs(a[i]-a[n-i-1]);

              //  debug(abs);
                gcd = gcd(gcd,abs);
            }

            pw.println(gcd);
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
