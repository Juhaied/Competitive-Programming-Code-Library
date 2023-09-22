import java.io.*;
import java.util.*;

public class Div4_898_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            int min = Integer.MAX_VALUE;

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
                min = Math.min(a[i],min);
            }
            long ans = 1;
            boolean flag = false;
            for (int i = 0;i<n;i++){
                if(a[i]==min && !flag){
                    ans*=(min+1);
                    flag = true;
                }
                else{
                    ans*=a[i];
                }
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
