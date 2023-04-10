import java.io.*;
import java.util.*;

public class Vacation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int a[][] = new int[n][3];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<3;j++){
                a[i][j] = in.nextInt();
            }
        }

        pw.println(solve(n,a));
        pw.close();
    }

    static long solve(int n, int a[][]){
        int dp[][] =new int[n][3];

        for(int i = 0;i<3;i++){
            dp[0][i] = a[0][i];
        }

        for(int i = 1;i<n;i++){
            dp[i][0]=a[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=a[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=a[i][2]+Math.max(dp[i-1][0],dp[i-1][1]);
        }
        return Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
