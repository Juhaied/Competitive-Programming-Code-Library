import java.io.*;
import java.util.*;

public class Div3_582_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long num = in.nextLong(), m = in.nextLong();

            long k = num/m;

            long x = k /10;
            long y = k % 10;

            long sum = 0;
            long ans = 0;
            for (int i = 0;i<=9;i++){
                ans+=m;
                sum+=(ans%10);
            }
            //debug(sum);
            ans = 0;
            sum*=x;
            //debug(sum+" "+y);
            for (int i = 0;i<y;i++){
                ans+=m;
                sum+=(ans%10);
            }

            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
