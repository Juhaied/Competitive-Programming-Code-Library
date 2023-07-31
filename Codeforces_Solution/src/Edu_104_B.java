import java.io.*;
import java.util.*;

public class Edu_104_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n  = in.nextInt(), k = in.nextInt();

            k--;

            if(n % 2==1){
                k += k/((n-1)/2);
            }
            int ans = (k %n)+1;
            pw.println(ans);

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
