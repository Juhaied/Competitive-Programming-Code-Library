import java.io.*;
import java.util.*;

public class Div2_877_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Long> l = new ArrayList<>();
            long ans = 0;
            long a[] = new long[n];
            for (int i = 0;i<n;i++){
                a[i] = in.nextLong();
                l.add(a[i]);

                if(a[i]<0){
                    ans = a[i];
                }
            }

            if(ans>=0){
                pw.println(Collections.max(l));
            }
            else {
                pw.println(ans);
            }



        }
        pw.close();
    }
    static int[] collections_toArray(ArrayList<Integer> list){
        int a[] = new int[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}