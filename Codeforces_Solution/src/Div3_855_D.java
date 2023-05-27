import java.io.*;
import java.util.*;

public class Div3_855_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            int cnt  = 0;

            for(int i  =0;i<s.length()-2;i++){
                if(s.charAt(i)==s.charAt(i+2)){
                    cnt++;
                }
            }

            pw.println(n-cnt-1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
