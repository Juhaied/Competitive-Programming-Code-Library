import java.io.*;
import java.util.*;

public class Div2_190_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        pw.println(n+m-1);
        pw.println(1+" "+1);
        for(int i = 2;i<=m;i++){
            pw.println(1+" "+i);
        }

        for(int i = 2;i<=n;i++){
            pw.println(i+" "+1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
