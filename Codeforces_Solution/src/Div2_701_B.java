import java.io.*;
import java.util.*;

public class Div2_701_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(),q = in.nextInt(),k = in.nextInt();
        int a[] = new int[n];

        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        for (int i = 0;i<q;i++){
            int l = in.nextInt()-1, r = in.nextInt()-1;
            pw.println(2*(k-(r-l+1))-(a[l]-1)-(k-a[r]));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
