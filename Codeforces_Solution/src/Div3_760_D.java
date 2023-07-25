import java.io.*;
import java.util.*;

public class Div3_760_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            Arrays.sort(a);

            long sum = 0;

            for (int i = 0;i<(n-k*2);i++){
                sum+=a[i];
            }
            //debug(a);

            for (int i = n-k,j = n - k *2;i<n;i++,j++){
                sum+=a[j]/a[i];
            }

            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
