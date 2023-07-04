import java.io.*;
import java.util.*;

public class Div2_584_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();

        int a[] = new int[101];

        for (int i = 0;i<n;i++){
            a[in.nextInt()]++;
        }

        boolean  vis[] = new boolean[101];

        int cnt = 0;

        for (int i = 1;i<=100;i++){
            if(!vis[i] && a[i]>0){
                cnt++;
                for (int j = i+i;j<=100;j+=i){
                    vis[j] = true;
                }
            }
        }

        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
