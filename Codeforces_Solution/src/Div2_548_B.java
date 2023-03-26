import java.io.*;
import java.util.*;

public class Div2_548_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

            int n = in.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i]=in.nextInt();
            }

            long ans = 0,now = Integer.MAX_VALUE;

            for(int i=n-1;i>=0;i--){
                now = Math.max(0,Math.min(now-1,a[i]));
                ans+=now;
            }

            pw.println(ans);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
