import java.io.*;
import java.util.*;

public class Div2_524_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int l = in.nextInt(), r = in.nextInt();

            if(l%2==1 && r %2==0){
                long sub = (r-l)+1;
                sub/=2;
                pw.println(sub);
            }
            else if(l%2==1 && r%2==1){
                long sub = (l+r)/2;
                pw.println((-1l)*sub);
            }
            else if(l%2==0 && r %2==0){
                long sub = (l+r)/2;
                pw.println(sub);
            }
            else{
                long sub = (r-l)+1;
                sub/=2;
                pw.println((-1L)*sub);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
