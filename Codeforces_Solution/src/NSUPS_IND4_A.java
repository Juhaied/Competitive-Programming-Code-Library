import java.io.*;
import java.util.*;

public class NSUPS_IND4_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int r = in.nextInt(),deg = in.nextInt();

            if((360/deg)%2==0){
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
