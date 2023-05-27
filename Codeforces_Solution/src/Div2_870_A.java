import java.io.*;
import java.util.*;

public class Div2_870_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];

            Arrays.setAll(a,i->in.nextInt());
            int ans  = -1;
            for(int j =0;j<n;j++){
                int cnt  = 0;

                for(int i = 0;i<n;i++){
                    if(a[i]>j){
                        cnt++;
                    }

                }

                if(cnt==j){
                    ans = j;
                    break;
                }
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
