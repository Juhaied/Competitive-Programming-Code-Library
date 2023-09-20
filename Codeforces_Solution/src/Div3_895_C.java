import java.io.*;
import java.util.*;

public class Div3_895_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long a = in.nextLong(), b = in.nextLong();

            if(a==2 && b==2 || (a==1 && b==1)||(a==1 && b==2)){
                pw.println(-1);
            }
            else if(b %2==0){
                pw.println(b/2+" "+b/2);
            }
            else if(b-1>=a) {
                long n1 = (b-1)/2;
                if(n1==1){
                    pw.println(-1);
                    // debug(1111);
                }
                else {
                    pw.println((b - 1)/ 2 + " " + (b - 1) / 2);
                }
            }

            else if(a==b && isPrime(a)){
                pw.println(-1);
            }
            else {
                Map<Long,Long> map = new HashMap<>();
                for (long i = 1; i * i <= b; i++) {
                    if (b % i == 0) {
                        map.put(i,1L);
                        if (b / i != i) {
                            map.put(b/i,1L);
                        }
                    }
                }
                long n1 = 0,n2 = 0;
                for (Long v:map.keySet()){
                    if(v==1 || v==b){
                        continue;
                    }
                    else {
                        if((b-v) % v==0){
                            n1 = v;
                            n2 = (b-v);
                            break;
                        }
                    }
                }

                // debug(map);
                //debug(n1+" "+n2);
                pw.println(n1+" "+n2);
            }
        }
        pw.close();
    }
    static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
