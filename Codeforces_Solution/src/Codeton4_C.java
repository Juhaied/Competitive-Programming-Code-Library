import java.io.*;
import java.util.*;

public class Codeton4_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong(),del = in.nextLong(), add = in.nextLong();

            ArrayList<Long> list = new ArrayList<>();
            HashSet<Long> set= new HashSet<>();

            for(int i = 0;i<n;i++){
                set.add(in.nextLong());
            }

            list = new ArrayList<>(set);

            long ans = (n-list.size())*del;


            Collections.sort(list);
            if(list.get(0)!=1){
                list.add(1L);
                ans+=add;
            }
            Collections.sort(list);

            long min = Long.MAX_VALUE;
            n = list.size();
            long ara[] = new long[(int) n];
            for(int i = 0;i<n;i++){
                ara[i] = list.get(i);
            }
            for(int i = 0;i<n;i++){
                long miss = add*(ara[i]-(i+1));
                long delete = (n-i-1)*del;

                long val = miss+delete;

                min = Math.min(val,min
                );
            }
            pw.println(ans+min);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
