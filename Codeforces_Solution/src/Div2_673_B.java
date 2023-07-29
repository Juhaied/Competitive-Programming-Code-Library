import java.io.*;
import java.util.*;

public class Div2_673_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            Arrays.sort(a);

            int cnt  = 0;

            int j = 1;

            int i = 0;

            while (j<n){
                int sum = a[0]+a[j];

                if(sum<=k){
                    a[j]+=a[0];
                    cnt++;
                }
                else {
                    j++;
                }
            }

            pw.println(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
