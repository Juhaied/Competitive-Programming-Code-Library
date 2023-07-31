import java.io.*;
import java.util.*;

public class Count_Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        pw.println(count_bit(n));
        pw.println(count_bit_hacks(n));
        pw.close();
    }
    static int count_bit(int n){
        int cnt = 0;
        while (n>0){
            cnt+=(n&1);
            n =n>>1;
        }
        return cnt;
    }

    static int count_bit_hacks(int n){
        int cnt  = 0;

        while (n>0){
            n = n &(n-1);
            cnt++;
        }

        return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
