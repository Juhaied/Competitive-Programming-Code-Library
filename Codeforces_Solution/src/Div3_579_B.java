import java.io.*;
import java.util.*;

public class Div3_579_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n*4];

            for(int i = 1;i<=n*4;i++){
                a[i-1] = in.nextInt();
            }

            Arrays.sort(a);

            int area = a[0]*a[a.length-1];

            boolean flag =true;

            for (int i = 0;i<n;i++){
                int left = 2*i;
                int right  = 4*n-2*i-2;

                if(a[left]!=a[left+1] || a[right]!=a[right+1] || a[left] *a[right] != area){
                    flag = false;
                    break;
                }
            }

            if(flag){
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
