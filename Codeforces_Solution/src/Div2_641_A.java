import java.io.*;
import java.util.*;

public class Div2_641_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong(), k = in.nextLong();

            if(n % 2==0){
                pw.println(n + (k*2));
            }
            else{
                int val = 0;
                for(int i = 3;i<=n;i+=2){
                    if(n % i == 0){
                        val = i;
                        break;
                    }
                }
                k--;
                pw.println(n+val+(k*2));
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
