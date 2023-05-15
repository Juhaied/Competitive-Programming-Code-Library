import java.io.*;
import java.util.*;

public class Edu_148_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            ArrayList<Long> list = new ArrayList<>();

            for(int i = 0;i<n;i++){
                list.add(in.nextLong());
            }

            Collections.sort(list);

            long pref[] = new long[n+1];

            for(int i = 0;i<n;i++){
                pref[i+1] = pref[i]+list.get(i);
            }

            //debug(pref);

            long sum = 0;
            for(int i =0;i<=k;i++){
                sum = Math.max(sum,pref[n-i]-pref[2*(k-i)]);

               // debug(sum+" "+pref[n-i]+" "+pref[2*(k-i)]);
            }
            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
