import java.io.*;
import java.util.*;

public class Div2_926_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            for (int i = 0 ;i<n;i++){
                int val = in.nextInt();
                min = Math.min(min,val);
                max = Math.max(max,val);
            }

            pw.println(max-min);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
