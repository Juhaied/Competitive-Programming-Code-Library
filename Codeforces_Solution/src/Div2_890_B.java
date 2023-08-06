import java.io.PrintWriter;
import java.util.Scanner;

public class Div2_890_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            if(n==1){
                pw.println("NO");
            }
            else {
                long ans = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 1) {
                        ans--;
                        continue;
                    }
                    ans += (a[i] - 1);
                }

                if (ans < 0) {
                    pw.println("NO");
                }
                else {
                    pw.println("YES");
                }
            }
        }

        pw.close();
    }




}