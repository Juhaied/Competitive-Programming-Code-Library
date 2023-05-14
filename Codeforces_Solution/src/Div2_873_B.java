import java.io.*;
import java.util.*;

public class Div2_873_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n+1];
            for(int i = 1;i<=n;i++){
                a[i] = in.nextInt();
            }

            ArrayList<Integer> l = new ArrayList<>();
            for(int i = 1;i<=n;i++){
               if(i==a[i]){
                   continue;
               }
               else {
                   l.add(Math.abs(a[i]-i));
               }
            }

            debug(l);

            int GCD = l.get(0);

            for(int i = 1;i<l.size();i++){
                GCD = gcd(GCD,l.get(i));
            }
            pw.println(GCD);

        }
        pw.close();
    }
    public static int gcd( int a, int b)
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