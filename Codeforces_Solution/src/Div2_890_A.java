import java.io.*;
import java.util.*;

public class Div2_890_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
                b[i] = a[i];
            }

            Arrays.sort(b);
            int ans  = 0;
            for (int i = n-1;i>=0;i--){
                if(a[i]!=b[i]){
                    ans = b[i];
                    break;
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
