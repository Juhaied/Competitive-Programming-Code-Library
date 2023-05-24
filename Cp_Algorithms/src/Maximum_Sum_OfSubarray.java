import java.io.*;
import java.util.*;

public class Maximum_Sum_OfSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = 5,k = 2;
        int a[] = {100,200,300,400,500};

        debug(maxSum(a,n,k));
        pw.close();
    }

        static int maxSum(int arr[], int n, int k) {
            // n must be greater
            if (n < k) {
                System.out.println("Invalid");
                return -1;
            }

            // Compute sum of first window of size k
            int max_sum = 0;
            for (int i = 0; i < k; i++) {
                max_sum += arr[i];
            }
            debug(max_sum);

            /* Compute sums of remaining windows by removing first element of previous window and adding
            / last element of current window.
             */
            int window_sum = max_sum;
            for (int i = k; i < n; i++) {
                window_sum += arr[i] - arr[i - k];
                max_sum = Math.max(max_sum, window_sum);
            }

            return max_sum;
        }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
