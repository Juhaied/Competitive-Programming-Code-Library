import java.io.*;
import java.util.*;

public class Div2_511_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long ans = Long.MIN_VALUE;
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long a = in.nextLong(), b = in.nextLong();
            ans= Math.max(a+b,ans);
        }
        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
