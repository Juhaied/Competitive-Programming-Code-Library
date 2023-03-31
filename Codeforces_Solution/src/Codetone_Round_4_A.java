import java.io.*;
import java.util.*;

public class Codetone_Round_4_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            boolean flag = false;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 1;i<=n;i++){
                int v = in.nextInt();
                if(v<=i){
                    flag = true;
                }
            }

            if(flag){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
