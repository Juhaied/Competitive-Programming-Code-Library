import java.io.*;
import java.util.*;

public class Div3_888_C{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            if(a[0]==a[n-1]){
                int cnt  = 0;
                for(int i :a){
                    if(i==a[0]){
                        cnt++;
                    }
                }

                if(cnt>=k){
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
            else {
                int cnt  = 0;
                int ind = -1;

                for (int i = 0;i<n;i++){
                    if(a[0]==a[i]){
                        cnt++;

                        if(cnt==k){
                            ind = i;
                            break;
                        }
                    }
                }

                cnt = 0;
                if(ind==-1){
                    pw.println("NO");
                }
                else {
                    for (int i = ind+1;i<n;i++){
                        if(a[i]==a[n-1]){
                            cnt++;
                        }
                    }

                    if(cnt>=k){
                        pw.println("YES");
                    }
                    else {
                        pw.println("NO");
                    }
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
