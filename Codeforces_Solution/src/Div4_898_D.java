import java.io.*;
import java.util.*;

public class Div4_898_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt(),ans = 0;

            String s = in.next();

            for (int i = 0;i<s.length();){
                if(s.charAt(i)=='B'){
                    ans++;
                    i+=k;
                }
                else{
                    i++;
                }
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
