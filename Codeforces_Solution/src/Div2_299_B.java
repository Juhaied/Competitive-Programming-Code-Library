import java.io.*;
import java.util.*;

public class Div2_299_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = in.next();

        long ans = 1<< (s.length());
        ans-=2;

        for (int i = s.length()-1,cnt = 0;i>=0;i--,cnt++){
            if(s.charAt(i)=='7'){
                ans += (1<<cnt);
            }
        }

        pw.println(ans+1);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
