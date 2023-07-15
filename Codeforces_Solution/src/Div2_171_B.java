import java.io.*;
import java.util.*;

public class Div2_171_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), t = in.nextInt();

        long a[] = new long[n];

        for (int i = 0;i<n;i++){
            a[i] = in.nextLong();
        }
        int cnt  = 0, j = 0;

        long sum = 0;

        for (int i = 0;i<n;i++){
            sum+=a[i];

            if(sum<=t){
                cnt++;
            }
            else {
                sum-=a[j];
                j++;
            }
        }

        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
