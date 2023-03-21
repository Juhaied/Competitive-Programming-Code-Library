import java.io.*;
import java.util.*;

public class Div2_360_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), d = in.nextInt();

        int count  = 0,ans = Integer.MIN_VALUE;

        for(int i = 0;i<d;i++){
            String s = in.next();

            if(s.contains("0")){
                count++;
                ans = Math.max(count,ans);
            }
            else {
                count = 0;
            }
        }

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
