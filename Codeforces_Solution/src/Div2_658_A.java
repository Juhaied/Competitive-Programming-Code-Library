import java.io.*;
import java.util.*;

public class Div2_658_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            HashSet<Integer> set = new HashSet<>();

            int ans = 0;

            for (int i = 0;i<n;i++){
                set.add(in.nextInt());
            }

            for (int i = 0;i<m;i++){
                int val = in.nextInt();

                if(set.contains(val)){
                    ans = val;
                }
            }

            if(ans==0){
                pw.println("NO");
            }
            else {
                pw.println("YES");
                pw.println(1+" "+ans);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
