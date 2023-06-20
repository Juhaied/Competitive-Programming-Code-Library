import java.io.*;
import java.util.*;

public class Div3_686_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

            long n = in.nextLong();
            long temp = n;
            long maxCount = 0;
            long maxInt = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (maxCount < count) {
                    maxCount = count;
                    maxInt = i;
                }
            }
           // debug(maxCount+" "+maxInt);
            if (maxInt == 0) {
                pw.println(1);
                pw.println(temp);
            } else {
                pw.println(maxCount);
                while (temp % (maxInt * maxInt) == 0) {
                    pw.print(maxInt + " ");
                    temp = temp / maxInt;
                }
                pw.println(temp);
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
