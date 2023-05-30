import java.io.*;
import java.util.*;

public class Div3_713_G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        int limit = (int) 1e7;

        int sod[] = new int[limit+1];
        for (int i = 1;i<=limit;i++){
            for (int j = i;j<=limit;j+=i){
                sod[j]+=i;
            }
        }
     //   debug(sod);


        int ans[] = new int[limit+1];

        Arrays.fill(ans,-1);
        for (int i = limit;i>=1;i--){
            int sum = sod[i];

            if(sum<=limit){
                ans[sum] = i;
                //debug(ans[sum]);
            }
           // debug(ans);
        }

      //  debug(ans);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int c = in.nextInt();
            pw.println(ans[c]);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
