import java.io.*;
import java.util.*;

public class Div3_881_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();



            ArrayList<Long> list = new ArrayList<>();

            long sum = 0;
            for (int i = 0;i<n;i++){
                long v = in.nextLong();
                sum+=Math.abs(v);
                if(v!=0) {
                    list.add(v);
                }
            }

            long a[] = new long[list.size()];

            a = collections_toArray(list);

            int cnt  = 0,neg = 0;
            ArrayList<Integer> ind = new ArrayList<>();
            for (int i = 0;i<a.length;i++){
                if(a[i]<0){
                    cnt++;
                }
                else{
                    if(cnt!=0) {
                        ind.add(cnt);
                        cnt = 0;
                    }
                }
            }
            if(cnt!=0) {
                ind.add(cnt);
            }
           pw.println(sum+" "+ind.size());
        }
        pw.close();
    }
    static long[] collections_toArray(ArrayList<Long> list){
        long a[] = new long[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
