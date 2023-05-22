import java.io.*;
import java.util.*;

public class Div2_683_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            int sum = 0;
            int min = Integer.MAX_VALUE;
            int cnt  = 0;
            for(int i = 0;i<n;i++){
                for (int j = 0;j<m;j++){
                    int value = in.nextInt();

                    if(value<0){
                        cnt++;
                    }
                    sum+=Math.abs(value);
                    min = Math.min(min,Math.abs(value));
                }
            }

            if(cnt %2==0){
                pw.println(sum);
            }
            else {
                pw.println(sum-(2*min));
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
