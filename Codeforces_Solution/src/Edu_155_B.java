import java.io.*;
import java.util.*;

public class Edu_155_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int  n = in.nextInt();

            long a[] = new long[n];
            long b[] = new long[n];

            long m1 = Long.MAX_VALUE,m2 = Long.MAX_VALUE;
            long s1 = 0,s2 = 0;

            for (int i = 0;i<n;i++){
                a[i] = in.nextLong();
                s1+=a[i];
                m1 = Math.min(m1,a[i]);
            }
            for (int i = 0;i<n;i++){
                b[i] = in.nextLong();
                s2+=b[i];
                m2 = Math.min(m2,b[i]);
            }

            pw.println(Math.min(s1+(m2*n),s2+(m1*n)));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
