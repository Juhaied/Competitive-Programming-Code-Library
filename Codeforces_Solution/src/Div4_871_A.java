import java.io.*;
import java.util.*;

public class Div4_871_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();
            String str = "codeforces";
            int c = 0;
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)!=str.charAt(i)){
                    c++;
                }
            }

            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
