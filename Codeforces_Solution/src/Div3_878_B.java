import java.io.*;
import java.util.*;

public class Div3_878_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            int pow = (int)Math.pow(2,k);

            if(pow>n){
                pw.println(n+1);
            }
            else {
                pw.println(pow);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
