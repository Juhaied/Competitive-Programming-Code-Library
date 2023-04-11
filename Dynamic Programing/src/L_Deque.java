import java.io.*;
import java.util.*;

public class L_Deque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        long a[] = new long[n];
        for(int i = 0 ;i<n;i++){
            a[i] = in.nextLong();
        }

        pw.println(solve(a,n));
        pw.close();
    }
    static long solve(long a[],int n){
        long dp[][] = new long[n][n];

        for(int i = n-1;i>=0;i--){
            for (int j = i;j<n;j++){
                if(i==j){
                    dp[i][j] = a[i];
                }
                else{
                    dp[i][j] = Math.max(a[i]-dp[i+1][j],a[j]-dp[i][j-1]);
                }
            }
        }

        return dp[0][n-1];

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
