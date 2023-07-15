import java.io.*;
import java.util.*;

public class Div2_728_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            long a[] = new long[n+1];

            for (int i = 1;i<=n;i++){
                a[i] = in.nextLong();
            }

            int c = 0;
            for (long i = 1;i<=n;i++){
                for (long j = a[(int) i]-i; j<=n; j+=a[(int) i]){
                    if(j>=0){
                        if((a[(int) i]*a[(int) j]==(i+j)) && i<j){
                            c++;
                        }
                    }
                }
            }

            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
