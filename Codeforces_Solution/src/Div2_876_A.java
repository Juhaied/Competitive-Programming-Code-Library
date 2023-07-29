import java.io.*;
import java.util.*;

public class Div2_876_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            int ans = (n-1)/k;

            if((n-1) % k !=0){
                ans++;
            }
            ans++;
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
