import java.io.*;
import java.util.*;

public class Div2_853A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            if(solve(a)){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }

        }
        pw.close();
    }
    public static boolean solve(int a[]){
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(gcd(a[i],a[j])<=2){
                    return true;
                }
            }
        }
        return false;
    }

    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;

        else
            return gcd(b,a%b);
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
