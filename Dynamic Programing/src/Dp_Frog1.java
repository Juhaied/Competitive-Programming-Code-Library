import java.io.*;
import java.util.*;

public class Dp_Frog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        pw.println(solve(n, a));
        pw.close();
    }
    static long solve(int n, int a[]) {
        int[] dp = new int[n];
        if (n == 1) return 0L;
        dp[1] = Math.abs(a[0] - a[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 2] + Math.abs(a[i - 2] - a[i]), dp[i - 1] + Math.abs(a[i - 1] - a[i]));
        }
        return dp[n - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
