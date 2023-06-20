import java.io.*;
import java.util.*;

public class Codetone_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            boolean even = false,zero = false,one = false,two = false;

            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();

                if(a[i]==0){
                    zero = true;
                }

                if(a[i]==1){
                    one = true;
                }
                if(a[i]==2){
                    two = true;
                }

            }

            Arrays.sort(a);
            if(one){
                if(zero || two){
                    pw.println("NO");
                }
                else {
                    boolean f = true;
                    for (int i = 0;i<n-1;i++){
                        if(a[i]+1==a[i+1]){
                            f = false;
                            break;
                        }
                    }

                    if(f){
                        pw.println("YES");
                    }
                    else {
                        pw.println("NO");
                    }
                }
            }
            else {
                pw.println("YES");
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
