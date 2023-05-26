import java.io.*;
import java.util.*;

public class Div3_693_C {
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

            int dp[] = new int[n];

            int max = 0;

            for(int i = n-1;i>=0;i--){
                if(i+a[i]>=n){
                    dp[i] = a[i];
                }
                else {
                    dp[i] = a[i]+dp[i+a[i]];
                }
                max = Math.max(max,dp[i]);
                //debug(i+" "+dp[i]);
            }
            pw.println(max);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
