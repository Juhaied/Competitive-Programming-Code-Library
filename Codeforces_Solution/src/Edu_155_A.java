import java.io.*;
import java.util.*;

public class Edu_155_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            long s = in.nextLong(), end = in.nextLong();

            long ans = s;

           // Map<Long,Long> map = new HashMap<>();

            for (int i = 0;i<n-1;i++){
                long v = in.nextLong(), e = in.nextLong();

                if(v>=s && e>=end){
                    ans = -1;
                }
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
