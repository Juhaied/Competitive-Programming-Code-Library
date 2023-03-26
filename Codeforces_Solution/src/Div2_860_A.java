import java.io.*;
import java.util.*;

public class Div2_860_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            for(int i = 0;i<n;i++){
                b[i] = in.nextInt();
            }

            boolean flag = true;

            for(int i = 0;i<n;i++){
                if(a[i]<b[i]){
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }
            }
            int max1 = 0,max2=0;
            for(int i = 0;i<n;i++){
                max1=Math.max(max1,a[i]);
                max2 = Math.max(max2,b[i]);
            }

            if(max1==a[n-1] && max2==b[n-1]){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
