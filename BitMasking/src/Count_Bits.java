import java.io.*;
import java.util.*;

public class Count_Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = 15;
        int cnt = 0;
        while (n>0){
            cnt+=(n&1);
            n =n>>1;
        }
        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
