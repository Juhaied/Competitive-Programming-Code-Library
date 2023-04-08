import java.io.*;
import java.util.*;

public class Div2_864_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            ArrayList<Integer> l = new ArrayList<>();

            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }

            }

            int req = 0;

            for(int i = 0;i<n;i++){
                for (int j = 0;j<n;j++){
                    if(a[i][j] != a[n-i-1][n-j-1]){
                        req++;
                    }
                }
            }

            req/=2;

            if(k>=req && ( n %2==1 || (req-k) %2==0)){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }



        }


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
