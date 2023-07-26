import java.io.*;
import java.util.*;

public class Div3_888_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long m = in.nextLong(),k = in.nextLong(),H = in.nextLong();
            int cnt = 0;
            int a[] = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            // debug(a);
            for (int i = 0;i<n;i++){
                long sub =Math.abs( H - a[i]);
                if(sub!=0) {
                    long div = sub / k;


                    if (sub % k == 0) {
                        if (div + 1 <= m) {
                            cnt++;
                        }
                    }
                    //debug(a[i] + " " + sub + " " + div + " " + cnt);
                }
            }

            pw.println(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
