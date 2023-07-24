import java.io.*;
import java.util.*;

public class Div1Plus2_884_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            if(n==1){
                pw.println(1);
            }
            else if (n==2) {
                pw.println(1+" "+2);
            }
            else if(n==3){
                pw.println(2+" "+1+" "+3);
            }
            else {
                int a[] = new int[n];

                a[0] = 2;
                a[n-1] = 3;
                a[n/2] = 1;
                int c = 4;
                for (int i = 0;i<n;i++){
                    if(a[i]==0){
                        a[i]=c;
                        c++;
                    }
                }

                for (int i :a){
                    pw.print(i+" ");
                }
                pw.println();
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
