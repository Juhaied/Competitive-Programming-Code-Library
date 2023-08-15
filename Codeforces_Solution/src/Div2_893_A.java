import java.io.*;
import java.util.*;

public class Div2_893_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long a = in.nextLong(),b = in.nextLong(), c = in.nextLong();

            if(c%2==0){
                if(a>b){
                    pw.println("First");
                }
                else {
                    pw.println("Second");
                }
            }
            else {
                if(a>=b){
                    pw.println("First");
                }
                else{
                    pw.println("Second");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
