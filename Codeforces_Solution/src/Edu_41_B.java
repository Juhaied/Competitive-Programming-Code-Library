import java.io.*;
import java.util.*;

public class Edu_41_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        int values[] = new int[n];
        int  sleep[] = new int[n];

        for (int i = 0;i<n;i++){
            values[i] = in.nextInt();
        }

        for (int i = 0;i<n;i++){
            sleep[i] = in.nextInt();
        }

        long sum = 0;

        for (int i = 0;i<n;i++){
            if(sleep[i]==1){
                sum+=values[i];
                values[i] = 0;
            }
        }


        int cs[] = new int[n+1];

        for (int i = 1;i<=n;i++){
            cs[i] = cs[i-1]+values[i-1];
        }


        long ans  = 0;
        for (int i= 0;i<=n-k;i++){
            ans = Math.max(ans,cs[i+k]-cs[i]);
        }
        pw.println(sum+ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
