import java.io.*;
import java.util.*;

public class Div2_865_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long  n = in.nextLong();

            long a[][] = new long[2][(int) n];

            long n2 = 2*n;
            long left = n*2 , right  = 2;
            for(int i = 0;i<n;i++){
                if(i%2==0){
                    a[0][i] = left;
                    left-=2;
                }
                else {
                    a[0][i] = right;
                    right+=2;
                }
            }

            for(int i = 0;i<n-1;i++){
                a[1][i] = a[0][i+1]-1;
            }
            a[1][(int) (n-1)] = (2*n)-1;

           for (int i = 0;i<2;i++){
               for(int j = 0;j<n;j++){
                   pw.print(a[i][j]+" ");
               }
               pw.println();
           }
           //pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
