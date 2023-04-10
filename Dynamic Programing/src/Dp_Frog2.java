import java.io.*;
import java.util.*;

public class Dp_Frog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), k = in.nextInt();

        int a[] = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        pw.println(solve(n,k,a));
        pw.close();
    }

    static  long solve(int n , int k ,int a[]){

        int dp[] = new int[n];

        if(n==1){
            return 0l;
        }

        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(a[1]-a[0]);

        for(int i = 2;i<n;i++){
            long min = Long.MAX_VALUE;
            for(int j = 1;j<=k;j++){
                if(i-j>=0) {
                    dp[i] = Math.min(dp[i],dp[i-j]+Math.abs(a[i-j]-a[i]));
                }

            }
        }

     //   debug(dp);
        return dp[n-1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
