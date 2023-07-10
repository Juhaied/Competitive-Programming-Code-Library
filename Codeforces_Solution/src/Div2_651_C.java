import java.io.*;
import java.util.*;

public class Div2_651_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s1 = "Ashishgup";
            String s2 = "FastestFinger";
            int n = in.nextInt();
            if(n==1){
                pw.println(s2);
            }
            else if(n==2){
                pw.println(s1);
            }
            else if(n % 2==1){
                pw.println(s1);
            }

            else {
                if((n&(n-1))==0){
                    pw.println(s2);
                }
                else if(n %4==0){
                    pw.println(s1);
                }
                else if(isPrime(n/2)){
                    pw.println(s2);
                }
                else {
                    pw.println(s1);
                }
            }

        }
        pw.close();
    }
    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }
        for(int i = 2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }


    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
