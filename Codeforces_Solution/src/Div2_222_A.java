import java.io.*;
import java.util.*;

public class Div2_222_A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = in.nextInt(), b = in.nextInt();
        int a1 = 0,a2 = 0,a3 = 0;
        for (int i = 1;i<=6;i++){
            if(Math.abs(a-i)<Math.abs(b-i)){
                a1++;
            }
            else  if(Math.abs(a-i)==Math.abs(b-i)){
                a2++;
            }
            else {
                a3++;
            }
        }

        pw.println(a1+" "+a2+" "+a3);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
