import java.io.*;
import java.util.*;

public class Edu_87_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char ch[] = in.next().toCharArray();

            int a = -1,b = -1, c = -1,ans = Integer.MAX_VALUE;

            for (int i = 0;i<ch.length;i++){
                if(ch[i]=='1'){
                    a = i;
                }
                else if(ch[i]=='2'){
                    b = i;
                }
                else {
                    c = i;
                }

                if(a!=-1 && b != -1 && c !=-1){
                    int min = Math.min(a,Math.min(b,c));
                    int mx = Math.max(a,Math.max(b,c));

                    ans = Math.min(ans,mx-min+1);
                }
            }

            if(ans != Integer.MAX_VALUE){
                pw.println(ans);
            }else {
                pw.println(0);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
