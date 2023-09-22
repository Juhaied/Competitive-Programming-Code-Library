import java.io.*;
import java.util.*;

public class Div4_898_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();

            if(s.charAt(0)=='c' && s.charAt(2)=='a'){
                pw.println("YES");
            }
            else if(s.charAt(0)=='a' && s.charAt(2)=='c'){
                pw.println("YES");
            }
            else if(s.charAt(1)=='c' && s.charAt(2)=='b'){
                pw.println("YES");
            }
            else if(s.charAt(1)=='b' && s.charAt(2)=='c'){
                pw.println("YES");
            }
            else if(s.charAt(0)=='b' && s.charAt(1)=='a'){
                pw.println("YES");
            }
            else if(s.charAt(0)=='a' && s.charAt(1)=='b'){
                pw.println("YES");
            }

            else {
                pw.println("NO");
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
