import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.util.*;

public class Div2_553_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = "ACTG";
        int n = in.nextInt();
        String s1 = in.next();
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0;i<n-3;i++){
            int A = Math.abs(s1.charAt(i)-'A');
            int C = Math.abs(s1.charAt(i+1)-'C');
            int T = Math.abs(s1.charAt(i+2)-'T');
            int G = Math.abs(s1.charAt(i+3)-'G');

            A = Math.min(A,26-A);
            C = Math.min(C,26-C);
            T = Math.min(T,26-T);
            G = Math.min(G,26-G);

            ans = Math.min(ans,(A+C+T+G));
        }

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
