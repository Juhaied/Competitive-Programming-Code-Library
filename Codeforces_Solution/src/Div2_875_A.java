import java.io.*;
import java.util.*;

public class Div2_875_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }


            for(int i = 0;i<n;i++){
                pw.print((n+1)-a[i]+" ");
            }

            pw.println();
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
