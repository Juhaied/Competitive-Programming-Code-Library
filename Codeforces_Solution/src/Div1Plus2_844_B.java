import java.io.*;
import java.util.*;

public class Div1Plus2_844_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            Arrays.sort(a);

            int res = 0;

            if(a[0]!=0){
                res++;
            }

            for (int i = 0;i<n-1;i++){
                if(a[i]<=i){
                    if(a[i+1]>(i+1)){
                        res++;
                    }
                }
            }
            pw.println(res+1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
