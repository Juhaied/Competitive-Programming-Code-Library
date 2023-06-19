import java.io.*;
import java.util.*;

public class PrimeFactorization_OSqrtN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        for (int i = 2;i*i<=n;i++){
            if(n % i==0){
                int cnt  = 0;
                while (n%i==0){
                    n/=i;
                    cnt++;
                }
                pw.println(i+" ^ "+cnt);
            }
        }
        if(n>1){
            pw.print(n+" ^ "+1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
