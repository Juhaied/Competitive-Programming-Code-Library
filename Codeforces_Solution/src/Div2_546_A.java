import java.io.*;
import java.util.*;

public class Div2_546_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0;i<n;i++){
            in.nextInt();
            a[i] = in.nextInt();
        }


        int k = in.nextInt();

        int cnt  = 0;
        for (int i = 0;i<n;i++){
            if(k<=a[i]){
                cnt = (n-i);
                break;
            }
        }

        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
