import java.io.*;
import java.util.*;

public class Div2_892_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            long ans = 0l;

            for (int i = 1;i<=n;i++){
                long sum = 0l,max= 0;

                for (int j = 1;j<i;j++){
                    sum+=(j*j);
                    max= Math.max(max,j*j);
                }
                //debug(sum+" "+i);
                for (int j = i;j<=n;j++){
                    sum+=(j*(n-j+i));
                    max = Math.max(max,(j*(n-j+i)));
                }

                sum-=max;
                ans = Math.max(ans,sum);
            }
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
