import java.io.*;
import java.util.*;

public class Div2_524_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

            long n = in.nextLong(), k = in.nextLong();
            long ans = 0;

            long v = n*2;

            ans += (v/k);

            if(v%k!=0){
                ans++;
            }

            v = (n*5);
            ans += (v/k);

            if(v%k!=0){
                ans++;
            }

            v = (n*8);
            ans += (v/k);

            if(v%k!=0){
                ans++;
            }

            pw.println(ans);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
