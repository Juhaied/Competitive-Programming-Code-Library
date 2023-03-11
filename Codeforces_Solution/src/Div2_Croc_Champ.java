import sun.misc.GC;

import java.io.*;
import java.util.*;

public class Div2_Croc_Champ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int a[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
            set.add(a[i]);
        }
        int GCD = a[0];

        for(int i = 1;i<n;i++){
            GCD = gcd(GCD,a[i]);
        }
        if(set.contains(1) && GCD==1){
            pw.println(1);
        }
        else if(GCD==1){
            pw.println(-1);
        }
        else {
            if(set.contains(GCD)){
                pw.println(GCD);
            }
            else {
                pw.println(-1);
            }
        }
        pw.close();
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
