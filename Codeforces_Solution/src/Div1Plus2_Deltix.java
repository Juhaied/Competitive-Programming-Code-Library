import java.io.*;
import java.util.*;

public class Div1Plus2_Deltix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt();
            int sub = Math.abs(a-b);
            if(sub%2==1){
                pw.println(-1);
            }
            else if(a==0 && b==0){
                pw.println(0);
            }
            else if(a==b){
                pw.println(1);
            }else {
                pw.println(2);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
