import java.io.*;
import java.util.*;

public class Div2_865_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();

            pw.println(2);
            pw.println(x-1+" "+1);
            pw.println(x+" "+y);
        }



        pw.close();
    }





    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
