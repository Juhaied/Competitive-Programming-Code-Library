import java.io.*;
import java.util.*;

public class Div3_867_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();

            long a = (n+1)*(n+2)/2;
            long b = (n*(n+1))/2;

            pw.println(a+b+1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
