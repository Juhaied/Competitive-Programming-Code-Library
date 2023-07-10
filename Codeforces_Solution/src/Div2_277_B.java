import javafx.beans.property.SimpleMapProperty;

import java.io.*;
import java.util.*;

public class Div2_277_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int a[] = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        int m = in.nextInt();

        int b[] = new int[m];

        for (int i = 0;i<m;i++){
            b[i] = in.nextInt();
        }

        int cnt = 0;

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if(Math.abs(a[i]-b[j])<=1){
                    cnt++;
                    b[j]= 110;
                    break;
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
