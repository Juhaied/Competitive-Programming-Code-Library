import java.io.*;
import java.util.*;

public class Global_24_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
                max = Math.max(max,a[i]);
            }

            int gcd = a[0];

            for (int i = 1;i<n;i++){
                gcd = gcd(gcd,a[i]);
            }

            pw.println(max/gcd);
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

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
