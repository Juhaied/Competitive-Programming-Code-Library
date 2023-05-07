import java.io.*;
import java.util.*;

public class Div4_871_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            int max = Integer.MIN_VALUE;
            int cnt = 1;

            boolean flag = false;
            int cnt1 = 0;
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();

                if(a[i]==0){
                    cnt1++;
                    flag =true;
                }
            }

            for(int i = 0;i<n-1;i++){
                if(a[i]==a[i+1] && a[i]==0){
                    cnt++;
                }
                else {
                    max = Math.max(cnt,max);
                    cnt =1;
                }
            }

            if (cnt1==0){
                pw.println(0);
            }
            else {
                max = Math.max(cnt, max);
                pw.println(max);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
