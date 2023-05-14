import java.io.*;
import java.util.*;

public class Div2_873_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int sum = 0;

            for(int i = 1;i<=n;i++){
                sum+=i*2;
                pw.print(i*2+" ");
            }

            pw.println();

            //debug(sum % n);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
