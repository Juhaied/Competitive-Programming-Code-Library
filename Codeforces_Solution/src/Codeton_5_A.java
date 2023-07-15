import java.io.*;
import java.util.*;

public class Codeton_5_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();

            long s1 = 0,s2 = 0;

            for (int i = 0;i<n;i++){
                s1+=in.nextLong();
            }
            for (int i = 0;i<m;i++){
                s2+=in.nextLong();
            }

            if(s1==s2){
                pw.println("Draw");
            }
            else if(s1>s2){
                pw.println("Tsondu");
            }
            else {
                pw.println("Tenzing");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
