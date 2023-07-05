import java.io.*;
import java.util.*;

public class Div1Plus2_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 2; i * i <= n; i++) {
                int cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n = n / i;
                    if (!hm.containsKey(cnt)) hm.put(cnt, i);
                    else hm.put(cnt, hm.get(cnt) * i);
                }
            }
            if (n != 1) {
                if (!hm.containsKey(1)) hm.put(1, n);
                else hm.put(1, hm.get(1) * n);
            }

            debug(hm);
            int res = 0;
            for (int k : hm.keySet()) {
                res += hm.get(k);
            }
            pw.println(res);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
