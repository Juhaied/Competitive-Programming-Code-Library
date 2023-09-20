import java.io.*;
import java.util.*;

public class Div3_895_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

            if(a==b){
                pw.println(0);
            }
            else if(Math.abs(a-b)<=c){
                pw.println(1);
            }
            else {
                int sub = Math.abs(a-b);

                if(sub%c==0){
                    sub=sub/c;
                    if(sub%2==0) {
                        pw.println(sub / 2);
                    }
                    else {
                        pw.println(sub/2 +1);
                    }
                }
                else {
                    sub=sub/c;
                    sub=sub/2;
                    sub++;
                    pw.println(sub);
                    //  debug("here");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
