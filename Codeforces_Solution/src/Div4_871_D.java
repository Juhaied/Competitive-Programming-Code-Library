import java.io.*;
import java.util.*;

public class Div4_871_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();

            if(n==m){
                pw.println("YES");
            }
            else if(n % 3!=0){
                pw.println("NO");
            }
            else {
                if(solve(n,m)){
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }

    static boolean solve(int n , int m){
        if(n==m) return  true;
        else if (n %3!=0) {
            return false;
        }
        else return (solve(n/3,m)||solve(n*2/3,m));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
