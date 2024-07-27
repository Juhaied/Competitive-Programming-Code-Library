import java.io.*;
import java.util.*;

public class Div3_957_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a[] = new int[3];

            for (int i = 0;i<a.length;i++){
                a[i] = in.nextInt();
            }

            for(int i = 0;i<5;i++){
                Arrays.sort(a);
                a[0]+=1;
            }
            pw.println(a[0]*a[1]*a[2]);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
