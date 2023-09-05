import java.io.*;
import java.util.*;

public class Div2_326_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n  = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<n;i++){
            a[i] = in.nextInt(); b[i] = in.nextInt();
           // min = Math.min(min,b[i]);
        }
        //a[n+1] = 0;
        long sum = 0;
        min = b[0];
        sum+=a[0]*(b[0]);
        for (int i = 1;i<n;i++){
            min = Math.min(b[i],min);
            sum+=a[i]*min;
          //  debug(sum);
        }

        pw.println(sum);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
