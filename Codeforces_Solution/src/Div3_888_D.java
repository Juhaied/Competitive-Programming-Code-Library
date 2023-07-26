import java.io.*;
import java.util.*;

public class Div3_888_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        outer:
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n - 1];
            for (int i = 0; i < n - 1; i++) a[i] = in.nextLong();

            HashSet<Long> set = new HashSet<>();
            HashMap<Long, Integer> map = new HashMap<>();
            set.add(a[0]);
            map.put(a[0], 1);
            for (int i = 1; i < n - 1; i++) {
                set.add(a[i] - a[i - 1]);
                map.put(a[i] - a[i - 1], map.getOrDefault(a[i] - a[i - 1], 0) + 1);
            }
            ArrayList<Long> missing = new ArrayList<>();
            for (long i = 1; i <= n; i++) if (!set.contains(i)) missing.add(i);
            //    debug(set, missing);
            if (missing.size() == 1) {
                set.add(missing.get(0));
                for (long i = 1; i <= n; i++) if (!set.contains(i)){
                    pw.println("NO");
                    continue outer;
                }
                pw.println("YES");
                continue outer;
            }
            if (missing.size() != 2) {
                pw.println("NO");
                continue outer;
            }
            long need = missing.get(0) + missing.get(1);
            if (need <= n) {
                //  debug(need);
                if (map.getOrDefault(need, 0) >= 2L) {
                    set.add(missing.get(0));
                    set.add(missing.get(1));
                    //   debug(set);
                    for (long i = 1; i <= n; i++) if (!set.contains(i)){
                        pw.println("NO");
                        continue outer;
                    }
                    pw.println("YES");
                    continue outer;
                }
                pw.println("NO");
                continue outer;
            }
            if (set.contains(need)) {
                set.remove(need);
                set.add(missing.get(0));
                set.add(missing.get(1));
                for (long i = 1; i <= n; i++) if (!set.contains(i)) {
                    pw.println("NO");
                    continue outer;
                }
                pw.println("YES");
                continue outer;
            }
            pw.println("NO");
        }


        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}