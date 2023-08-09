import java.io.*;
import java.util.*;

public class Edu_77_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long a = in.nextLong(), b = in.nextLong();
            long sum = a+b;
            long min = Math.min(a,b);
            long max = Math.max(a,b);
            if(sum %3==0 && min*2>=max){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
