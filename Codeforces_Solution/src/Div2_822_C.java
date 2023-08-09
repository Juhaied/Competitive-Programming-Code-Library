import java.io.*;
import java.util.*;

public class Div2_822_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char ch[] = in.next().toCharArray();

            int a[] = new int[n+1];

            for (int i = 1;i<=n;i++){
                if(ch[i-1]=='1') {
                    a[i] = 2;
                }
            }

            long sum = 0;
            for (int i = 1;i<=n;i++){
                for (int j = i;j<=n;j+=i){
                    if(a[j]==0){
                        a[j]=1;
                        sum+=i;
                    }
                    else if(a[j]==2) {
                        break;
                    }
                }

            }

            pw.println(sum);


        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
