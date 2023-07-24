import java.io.*;
import java.util.*;

public class Edu_108_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt(), b = in.nextInt(), d = in.nextInt();

            if(a==b){
                pw.println("YES");
            }
            else if(Math.abs(a-b)<=d){
                pw.println("YES");
            }
            else{
                int max =Math.max(a,b);
                int min = Math.min(a,b);

                int div = max/min;

                if(max % min !=0){
                    div++;
                }
                if(div-1<=d){
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
