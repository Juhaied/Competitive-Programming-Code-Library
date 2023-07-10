import java.io.*;
import java.util.*;

public class Div3_661_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];
            Arrays.setAll(a,i->in.nextInt());
            Arrays.sort(a);

            int team = 0;

            for (int s = 2;s<=2*n;s++){
                int cnt = 0;
                for (int i = 0,j = n-1;i<j; ){
                    int sum = a[i]+a[j];

                    if(sum==s){
                        cnt++;
                        i++;
                        j--;
                    }
                    else if(sum<s){
                        i++;
                    }
                    else {
                        j--;
                    }
                }

                team = Math.max(team,cnt);
            }


            pw.println(team);

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
