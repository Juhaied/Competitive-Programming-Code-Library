import java.io.*;
import java.util.*;

public class Div2_511_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        int n = in.nextInt();

        int nc = n-2;

        if(nc%3==0){
            pw.println(1+" "+2+" "+(n-3));
        }
        else {
            pw.println(1+" "+1+" "+(nc));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}