import java.io.*;
import java.util.*;

public class Div3_702_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[3];
            for (int i = 0; i < n; i++) {
                int p = in.nextInt() % 3;
                ++a[p];
            }
            int p = n / 3;
            int res = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[j] > p) {
                        res += (a[j] - p);
                        a[(j + 1) % 3] += (a[j] - p);
                        a[j] = p;
                    }
                }
            }
            pw.println(res);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
