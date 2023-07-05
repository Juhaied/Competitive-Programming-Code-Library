import java.io.*;
import java.util.*;

public class Global_22_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            long ara[] = new long[k];

            for (int i = 0;i<k;i++){
                ara[i] = in.nextLong();
            }

           if(solve(ara,n)){
               pw.println("Yes");
           }
           else {
               pw.println("No");
           }
        }
        pw.close();
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
    public static boolean solve(long[] a, int n) {
        int k = a.length;
        if (k == 1) {
            return true;
        }
        long[] arr = new long[k - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[i + 1] - a[i];
        }

       // debug(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        long max = arr[0] * (n - k + 1);

       // debug(max+" "+a[0]);
        return max >= a[0];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
