import java.io.*;
import java.util.*;

public class Div2_332_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

       int d1 = in.nextInt(), d2 = in.nextInt(), d3 = in.nextInt();

       int ans = Math.min(d1,d2+d3)+Math.min(d2,d1+d3)+Math.min(d3,d1+d2);
       pw.println(ans);
       pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
