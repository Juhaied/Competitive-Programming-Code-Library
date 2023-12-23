import java.io.PrintWriter;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Div3_916_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for(int t = 1;t<=test;t++){
            int n = in.nextInt(), k = in.nextInt();

            int start = n-k;

            for (int i = start;i<=n;i++){
                pw.print(i+" ");
            }

            for (int i = start-1;i>=1;i--){
                pw.print(i+" ");
            }


            pw.println();
        }

        pw.close();
    }
}