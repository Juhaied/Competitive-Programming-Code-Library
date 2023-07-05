import java.io.*;
import java.util.*;

public class Edu_70_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s1 = in.next(),s2 = in.next();

            StringBuilder sb1 = new StringBuilder(s1);
            StringBuilder sb2 = new StringBuilder(s2);

            sb1 = sb1.reverse();
            sb2 = sb2.reverse();

            int ind = sb2.indexOf("1");
            int l = sb1.indexOf("1",ind);

            pw.println(l-ind);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
