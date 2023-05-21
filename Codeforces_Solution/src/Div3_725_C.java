import java.io.*;
import java.util.*;

public class Div3_725_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), start = in.nextInt(), end = in.nextInt();

            ArrayList<Long> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(in.nextLong());
            }


            long left = pairNum(list,start);
            long right = pairNum(list,end+1);

           // debug(left+" "+right);
            pw.println(right-left);
        }
        pw.close();
    }

    public static long pairNum(List<Long> a, int p) {
        Collections.sort(a);
        int n = a.size();
        int i = 0, j = n - 1;
        long count = 0;
        while (i < j) {
            if (a.get(i) + a.get(j) < p) {
                count += (long) j - (long) i;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
