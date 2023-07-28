import java.io.*;
import java.util.*;

public class Edu_152_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int b = in.nextInt(), c = in.nextInt(), hum = in.nextInt();

            int cnt = 2;
            b-=2;

            int sum = hum+c;

            int min = Math.min(sum,b);

            if(min!=sum){
                pw.println(min+(min+1)+cnt);
            }else {
                pw.println(cnt+sum+(sum-1));
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
