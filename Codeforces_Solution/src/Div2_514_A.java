import java.io.*;
import java.util.*;

public class Div2_514_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), L = in.nextInt(),a = in.nextInt();


        int t[] = new int[n];
        int l[] = new int[n];


        for(int i = 0;i<n;i++){
            t[i] = in.nextInt();
            l[i] = in.nextInt();
        }

        int prev = 0,ans = 0;

        for(int i = 0;i<n;i++){
            ans += (t[i]-prev)/a;
            prev = t[i]+l[i];
        }

        ans+=(L-prev)/a;

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
