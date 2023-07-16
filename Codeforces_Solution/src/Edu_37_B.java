import java.io.*;
import java.util.*;

public class Edu_37_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int free=1;

            StringBuilder sb = new StringBuilder();

            for (int i = 1;i<=n;i++){
                int l = in.nextInt(), r = in.nextInt();

                int time = 0;

                if(free<=r){
                    time = Math.max(free,l);
                    free = time+1;


                }
                sb.append(time).append(' ');
            }

            pw.println(sb.toString());
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
