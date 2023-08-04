import java.io.*;
import java.util.*;

public class Div2_70_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();

        String s = "ROY";

        String str[] = {"G","B","I","V"};

        for (int i = 0;i<n-3;i++){
            s+=str[i%4];
        }

        pw.println(s);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
