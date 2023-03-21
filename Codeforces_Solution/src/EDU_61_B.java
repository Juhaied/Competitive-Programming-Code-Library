import java.io.*;
import java.util.*;

public class EDU_61_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long a[] = new long[n];

        long sum = 0;

        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
            sum+=a[i];
        }

        Arrays.sort(a);

        long q = in.nextLong();

        for(int i = 0;i<q;i++){
            pw.println(sum-a[n-in.nextInt()]);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
