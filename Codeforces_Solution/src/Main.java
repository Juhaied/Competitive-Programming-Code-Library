import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the remaining newline

        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the arrangement
            sc.nextLine();
            String a = sc.nextLine(); // Lower bound string
            String b = sc.nextLine(); // Upper bound string

            // Solve for the current test case
            System.out.println(countValidArrangements(n, a, b));
        }

        sc.close();
    }

    private static int countValidArrangements(int n, String a, String b) {
        List<String> validArrangements = new ArrayList<>();
        char[] current = new char[n];
        boolean[] visited = new boolean[26]; // To keep track of visited letters

        generateArrangements(0, n, current, visited, validArrangements);

        int count = 0;
        for (String arrangement : validArrangements) {
            if (arrangement.compareTo(a) >= 0 && arrangement.compareTo(b) <= 0) {
                count = (count + 1) % MOD;
            }
        }

        return count;
    }

    private static void generateArrangements(int pos, int n, char[] current, boolean[] visited, List<String> validArrangements) {
        if (pos == n) {
            validArrangements.add(new String(current));
            return;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';
            if (isValid(pos, current, c)) {
                current[pos] = c;
                visited[index] = true;
                generateArrangements(pos + 1, n, current, visited, validArrangements);
                visited[index] = false;
            }
        }
    }

    private static boolean isValid(int pos, char[] current, char c) {
        if (pos >= 2 && current[pos - 2] == c) {
            return false; // Violates the COC rule for alternates
        }
        return true;
    }
}
