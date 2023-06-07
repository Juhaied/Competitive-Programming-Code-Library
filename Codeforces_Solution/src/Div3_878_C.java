import java.io.*;
import java.util.*;

public class Div3_878_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(),k = in.nextInt(),q  = in.nextInt();

            int a[] = new int[n];
            int val[] = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();

            }

            long ans = 0;
            for (int i = 0;i<n;){
                long count = 0;
                int j = i;
                for (;j<n;j++){
                    if(a[j]<=q){
                        count++;
                    }
                    else break;
                }

                count-=(k-1);

                if(count>0){
                    ans+=(count*(count+1))/2;

                }
                i=j+1;
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
