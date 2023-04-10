import java.io.*;
import java.util.*;

public class Grid1 {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = in.next().toCharArray();
        }
        pw.println(solve(s, n, m));


        pw.close();
    }

    static long solve(char[][] s, int n, int m) {
        long[][] dp = new long[n][m];

        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (s[i][0] == '#') ok = true;
            if (!ok) dp[i][0] = 1;
        }

        ok = false;
        for (int j = 0; j < m; j++) {
            if (s[0][j] == '#') ok = true;
            if (!ok) dp[0][j] = 1;
        }


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (s[i][j] == '#') continue;
                dp[i][j] = (dp[i - 1][j] % mod + dp[i][j - 1] % mod) % mod;
            }
        }
        return dp[n - 1][m - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
