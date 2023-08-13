import java.io.*;
import java.util.*;

public class Div2_892_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE,max =Integer.MIN_VALUE;
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
                min = Math.min(min,a[i]);
                max = Math.max(max,a[i]);

            }

            if(min == max){
                pw.println(-1);
            }
            else {
                ArrayList<Integer> l1 = new ArrayList<>();
                ArrayList<Integer> l2 = new ArrayList<>();

                for (int i = 0;i<n;i++){
                    if(a[i]==max){
                        l2.add(a[i]);
                    }
                    else {
                        l1.add(a[i]);
                    }
                }

                pw.println(l1.size()+" "+ l2.size());

                for (int i:l1){
                    pw.print(i+" ");
                }
                pw.println();

                for (int i :l2){
                    pw.print(i+" ");
                }
                pw.println();
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
