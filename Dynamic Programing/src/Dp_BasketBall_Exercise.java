import java.io.*;
import java.util.*;

public class Dp_BasketBall_Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        long a[] = new long[n+1];
        long b[] =  new  long[n+1];

        for(int i = 1;i<=n;i++){
            a[i] = in.nextLong();
        }

        for(int i = 1;i<=n;i++){
            b[i] = in.nextLong();
        }

        long dpA[] = new long[n+1],dpB[] = new long[n+1];

        for(int i = 1;i<=n;i++){
            dpA[i] = Math.max(dpB[i-1]+a[i],dpA[i-1]);
            dpB[i] = Math.max(dpA[i-1]+b[i],dpB[i-1]);
        }


        pw.println(Math.max(dpA[n],dpB[n]));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
