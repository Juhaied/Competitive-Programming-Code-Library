import java.io.*;
import java.util.*;

public class Div2_239_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int a[] = new int[n];
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = 0;j<a[i];j++){
                sum+=(in.nextInt()*5);
            }

            sum+=(a[i]*15);
            ans=Math.min(ans,sum);
        }
        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
