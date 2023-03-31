import java.io.*;
import java.util.*;

public class Spoj_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();

            long sum = 0;

            for(int i = 0;i<s.length();i++){
                sum+=s.charAt(i)-'0';
            }
            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
