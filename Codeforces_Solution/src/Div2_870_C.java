import java.io.*;
import java.util.*;

public class Div2_870_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();


            if(n==1 || m==1){
                pw.println("YES");
            }
            else if(n %m==0 ||n<=m || n % 2==0){
                pw.println("NO");
            }
            else {
                int div = 0;

                for(int i = 2;i*i<=n;i++){
                    if(n % i ==0){
                        div = i;
                        break;
                    }
                }

                if(div ==0 || m<div){
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
