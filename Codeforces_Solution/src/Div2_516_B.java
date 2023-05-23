import java.io.*;
import java.util.*;

public class Div2_516_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int cnt = Integer.bitCount(n);
           // debug(Integer.bitCount(n));
            pw.println((long)Math.pow(2,cnt));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
