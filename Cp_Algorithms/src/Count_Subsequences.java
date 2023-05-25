import java.util.Scanner;

public class Count_Subsequences {
    public static int countSubsequences(String s) {
        int n = s.length();
        String word = "NSU";

        int[][] dp = new int[n + 1][word.length()+1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= word.length(); j++) {
                dp[i][j] = dp[i - 1][j] + (s.charAt(i - 1) == word.charAt(j - 1) ? dp[i - 1][j - 1] : 0);
            }
        }

        return dp[n][word.length()];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        String s = scanner.next();

        // Calculate and print the answer
        int answer = countSubsequences(s);
        System.out.println(answer);

        scanner.close();
    }
}
