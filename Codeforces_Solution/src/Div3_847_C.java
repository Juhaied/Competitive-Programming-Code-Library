import java.io.*;
import java.util.*;

public class Div3_847_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[][] = new int[n][n-1];

            for(int i = 0; i < n ; i++)
                for(int j = 0; j < n - 1; j++)
                    a[i][j] = in.nextInt();
            int b = 0;
            if(a[0][0] == a[1][0])
                b = a[0][0];
            if(a[0][0] == a[2][0])
                b = a[0][0];
            if(a[1][0] == a[2][0])
                b = a[1][0];
            int k = 0;
            for(int i = 0; i < n; i++) {
                if(a[i][0] != b)
                    k = i;
            }
            System.out.print(b + " ");
            for(int i = 0; i < n - 1; i++)
                System.out.print(a[k][i] + " ");
            System.out.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
