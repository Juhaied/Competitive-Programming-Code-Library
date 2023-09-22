import java.io.*;
import java.util.*;

public class Div4_898_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

            int n = in.nextInt();
            long k = in.nextLong();


            int[] fruits = new int[n];
            int[] heights = new int[n];

            for (int i = 0; i < n; i++) {
                fruits[i] = in.nextInt();
            }


            for (int i = 0; i < n; i++) {
                heights[i] = in.nextInt();
            }


            int max = getMaxSubarrayLength(n, k, fruits, heights);
            pw.println(max);

        }
        pw.close();
    }

    public static int getMaxSubarrayLength(int n, long k, int[] fruits, int[] heights) {
        int maxSubarrayLength = 0;
        int subarrayStart = 0;
        long totalFruits = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && heights[i - 1] % heights[i] != 0) {
                subarrayStart = i;
                totalFruits = 0;
            }

            totalFruits += fruits[i];

            while (totalFruits > k) {
                totalFruits -= fruits[subarrayStart];
                subarrayStart++;
            }

            maxSubarrayLength = Math.max(maxSubarrayLength, i - subarrayStart + 1);
        }

        return maxSubarrayLength;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
