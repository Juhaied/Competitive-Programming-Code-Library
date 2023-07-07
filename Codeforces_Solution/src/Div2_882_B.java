import java.io.*;
import java.util.*;

public class Div2_882_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            int ans = a[0];

            for (int i = 0;i<n;i++){
                ans&=a[i];
            }

            if(ans>0){
                pw.println(1);
            }else {
                int part = 1;
                int cur = a[0];
                for (int i = 0;i<n;i++){
                    cur&=a[i];

                    if(cur==0) {
                        if (i == n - 1) break;
                        part++;
                        cur=a[i+1];
                    }

                }

                if(cur!=0){
                    part--;
                }

                pw.println(Math.max(part,1));
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
