import java.io.*;
import java.util.*;

public class Div2_783_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = in.nextInt();
        long[] A = new long[N];
        for (int n=0; n<N; n++) {
            A[n] = in.nextLong();
        }
        long min = Long.MAX_VALUE;
        for (int zero=0; zero<N; zero++) {
            long count = 0;
            long last = 0;
            for (int i=zero-1; i>=0; i--) {
                long a = A[i];

                long factor = last/a+1;
                count += factor;
                last = factor*a;
            }
            last = 0;
            for (int i=zero+1; i<N; i++) {
                long a = A[i];
                long factor = last/a+1;
                count += factor;
                last = factor*a;
            }
            min = Math.min(min, count);
        }
        pw.println(min);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
