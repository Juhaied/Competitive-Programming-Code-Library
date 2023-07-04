import java.io.*;
import java.util.*;

public class Edu_150_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int q = in.nextInt();
            int s = in.nextInt();
            int m = s;
            pw.print(1);
            boolean f = true;
            for(int i=1; i<q; i++){
                int x = in.nextInt();
                if(f){
                    if(x >= m){
                        m = x;
                        pw.print(1);
                    }
                    else if(x <= s){
                        pw.print(1);
                        m = x;
                        f = false;
                    }else{
                        pw.print(0);
                    }
                }else{
                    if(x >=m && x <=s){
                        m = x;
                        pw.print(1);
                    }
                    else
                        pw.print(0);
                }

               // pw.println();
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
