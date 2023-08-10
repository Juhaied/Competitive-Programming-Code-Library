import java.io.*;
import java.util.*;

public class Edu_72_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long strength = in.nextLong(), intelligenge = in.nextLong(), exp = in.nextLong();

            pw.println(binary_search(strength,intelligenge,exp));
        }
        pw.close();
    }

    static long binary_search(long str,long intel,long exp){
        if(str+exp<= intel)return 0;
        long l = 0, r = exp;
        long res = exp;
        while (l<=r){
            long mid = (l+r)/2;

            if((intel+mid)<(str+(exp-mid))){
                l = mid+1;
                res = mid;
            }
            else {
                r = mid-1;
            }
        }
        return res+1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
