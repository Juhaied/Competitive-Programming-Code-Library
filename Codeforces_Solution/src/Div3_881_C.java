import java.io.*;
import java.util.*;

public class Div3_881_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();

            long sum = n;

            while (n!=0){
                n/=2;
                sum+=n;
            }

            pw.println(sum);

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
