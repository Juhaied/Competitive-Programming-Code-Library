import java.io.*;
import java.util.*;

public class TechnoCup_Elimination_Round3_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int left = 0, right = Integer.MAX_VALUE;

            for (int i = 1;i<=n;i++){
                int l = in.nextInt(), r = in.nextInt();

                left = Math.max(left,l);
                right = Math.min(r,right);
            }

            pw.println(Math.max(0,left-right));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
