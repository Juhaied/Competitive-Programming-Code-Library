import java.io.*;
import java.util.*;

public class Div2_705_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            int ans = (k+1)/2;
            pw.println(n-ans);

            for (int i = ans;i<=n;i++){
                if(i!=k){
                    pw.print(i+" ");
                }
            }
            pw.println();
        }//
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
