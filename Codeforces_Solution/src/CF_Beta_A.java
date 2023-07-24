import java.io.*;
import java.util.*;

public class CF_Beta_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];

        for (int i = 0;i<n;i++){
            a[i]  = in.nextInt();
        }
        int cnt  = 0;
        for (int i = 1;i<n;i++){
            if(a[i]==a[i-1]){
                a[i]+=d;
                cnt++;
            }
            else if(a[i]<a[i-1]){
                int abs = Math.abs(a[i]-a[i-1]);

                int div = abs/d;

                if(abs% d !=0){
                    div++;
                }
                cnt+=div;
                a[i]+=(div*d);

                if(a[i]==a[i-1]){
                    a[i]+=d;
                    cnt++;
                }
            }
        }


        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
