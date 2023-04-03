import java.io.*;
import java.util.*;

public class Div2_862_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            pw.println(findXorValue(a));

        }

        pw.close();
    }
    public static int findXorValue(int[] a) {
        int xorResult = 0;

        // Compute the XOR of all the elements in the array a
        for (int i = 0; i < a.length; i++) {
            xorResult ^= a[i];
        }

        // Try XORing each element in the array with the XOR of all the elements
        // in the array, and check if the result is 0
        for (int i = 0; i < a.length; i++) {
            int bi = a[i] ^ xorResult;
            if (bi == 0) {
                return 0;
            }
        }

        // If we reach this point, there is no valid value of x
        return -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
