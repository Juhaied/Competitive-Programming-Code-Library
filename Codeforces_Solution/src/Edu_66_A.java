import java.io.*;
import java.util.*;

public class Edu_66_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong(), k = in.nextLong();
            long cnt = 0;
            while (n !=0){
                if(n % k==0){
                    n/=k;
                    cnt++;
                }
                else {
                    long rem = n % k;
                    cnt+=rem;
                    n-=rem;
                }
            }

            pw.println(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}