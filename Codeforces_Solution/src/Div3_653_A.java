import java.io.*;
import java.util.*;

public class Div3_653_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
           long x = in.nextLong(),y = in.nextLong(),n = in.nextLong();

           long k = (n-y)/x;
           k = (k*x)+y;
           pw.println(k);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
