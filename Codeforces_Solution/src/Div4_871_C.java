import java.io.*;
import java.util.*;

public class Div4_871_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            String str[] = new String[n];
            for(int i= 0;i<n;i++){
                a[i] = in.nextInt();
                str[i] = in.next();
            }

            boolean flag1 = false;
            boolean flag2 = false;
            for(int i = 0;i<n;i++){
                if(str[i].charAt(0)=='1'){
                    flag1 = true;
                }
                if(str[i].charAt(1)=='1'){
                    flag2 = true;
                }

                if(flag1 && flag2){
                    break;
                }
            }

            if(flag1 && flag2){
                long cnt = Long.MAX_VALUE,cnt2 = Long.MAX_VALUE;

                for(int i = 0;i<n;i++){
                    if(str[i].charAt(0)=='1'){
                        cnt = Math.min(cnt,a[i]);
                    }
                    if(str[i].charAt(1)=='1'){
                        cnt2 = Math.min(cnt2,a[i]);
                    }
                }

                long ans = cnt2+cnt;
                for(int i = 0;i<n;i++){
                    if(str[i].charAt(0)=='1' && str[i].charAt(1)=='1'){
                        ans = Math.min(ans,a[i]);
                    }
                }

                pw.println(ans);


            }
            else {
                pw.println(-1);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
