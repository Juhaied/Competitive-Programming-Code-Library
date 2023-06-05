import java.io.*;
import java.util.*;

public class Div2_637_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), a = in. nextInt(), b = in.nextInt(), c = in.nextInt(),d  = in.nextInt();

            int left = a-b,right = a+b;

            left*=n;
            right *=n;
            int l_r = c-d,r_r = c+d;
           if(right<l_r){
               pw.println("No");
               continue;
           }
            if(left>r_r){
               pw.println("No");
               continue;
           }
            pw.println("Yes");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
