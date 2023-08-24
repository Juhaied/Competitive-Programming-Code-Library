import java.io.*;
import java.util.*;

public class Div2_337_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = in.nextLong();
        if(n %2==1){
            pw.println(0);
        }
        else if(n==4){
            pw.println(0);
        }
        else if((n/2) %2==1){
            n/=2;
            n/=2;
            pw.println(n);
        }
        else {
            n/=2;
            n/=2;
            n--;
            pw.println(n);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
