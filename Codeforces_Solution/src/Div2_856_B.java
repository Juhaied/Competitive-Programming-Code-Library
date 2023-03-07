import java.io.*;
import java.util.*;

public class Div2_856_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt()+1;
            }

            for(int i = 1;i<n;i++){
                if(a[i]%a[i-1]==0){
                    a[i]+=1;
                }
            }



            for(int i:a){
                pw.print(i+" ");
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
