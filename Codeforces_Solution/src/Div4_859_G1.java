import java.io.*;
import java.util.*;

public class Div4_859_G1 {
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

            Arrays.sort(a);
            long sum = 1;
            if(a[0]!=1){
                pw.println("NO");
            }
            else {
                boolean flag = true;
                for (int i = 1; i < n; i++) {
                    if (a[i]>sum){
                        flag = false;
                        break;
                    }
                    sum+=a[i];
                   // debug(a[i]+" "+sum);
                }

                pw.println(flag?"YES":"NO");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
