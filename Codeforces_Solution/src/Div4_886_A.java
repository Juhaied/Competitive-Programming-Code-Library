import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Div4_886_A {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for (int t = 1; t<=test; t++){
            int  a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

            if(a+b >= 10 || a+c >= 10 || b + c>=10 ){
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
