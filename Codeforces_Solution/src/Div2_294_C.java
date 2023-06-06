import java.io.*;
import java.util.*;

public class Div2_294_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n= in.nextInt(), m = in.nextInt();

        long ans = Math.min(Math.min(n,m),((n+m)/3));

        pw.println(ans);
        pw.close();
    }

    static int way1(int n, int m){
        int div = n/2;
        div = Math.min(div,m);
        m-=div;

        if(n %2==1 && m>=2){
            div++;
        }
        return div;
    }

    static int way2(int n, int m){
        int div = m/2;
        div = Math.min(div,n);
       n-=div;

        if(m %2==1 && n>=2){
            div++;
        }
        return div;
    }
    static int way3(int n,int m){
        int ans = 1;

        int n1 = n-1;
        int m1 = m-2;

        int val1 = way1(n1,m1)+1;

        int val2 = way2(n-2,m-1)+1;

        return Math.max(val1,val2);
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
