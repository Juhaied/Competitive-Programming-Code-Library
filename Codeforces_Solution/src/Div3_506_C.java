import java.io.*;
import java.util.*;

public class Div3_506_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        long a[] = new long[n];

        for (int i = 0;i<n;i++){
            a[i] = in.nextLong();
        }

        int max = 1,cnt = 1;

        for (int i = 0;i<n-1;i++){
            if(a[i]*2>=a[i+1]){
                cnt++;
            }
            else {
                max = Math.max(max,cnt);
                cnt = 1;
            }
        }

        max = Math.max(cnt,max);

        pw.println(max);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
