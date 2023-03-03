import java.io.*;
import java.util.*;

public class Div3_855A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n=in.nextInt();
            String s=in.next();
            s=s.toLowerCase();
            String w=""+s.charAt(0);
            for(int i=1;i<n;i++){
                if(s.charAt(i)!=s.charAt(i-1))
                    w+=s.charAt(i);
            }

            if(w.equals("meow"))
                pw.println("YES");
            else
                pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
