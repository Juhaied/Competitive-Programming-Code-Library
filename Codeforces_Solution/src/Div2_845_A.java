import java.io.*;
import java.util.*;

public class Div2_845_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = (in.nextInt())%2;
            }
            int cnt = 0;
            for(int i = 0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    cnt++;
                }
            }

            pw.println(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
