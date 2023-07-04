import java.io.*;
import java.util.*;

public class Div3_535_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(),d = in.nextInt();

            if(a==c){
                pw.println(a+" "+d);
            }
            else {
                pw.println(a+" "+c);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
