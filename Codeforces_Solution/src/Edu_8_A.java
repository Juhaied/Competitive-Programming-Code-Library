import java.io.*;
import java.util.*;

public class Edu_8_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), b = in.nextInt(),p = in.nextInt();
        pw.println((n-1)*(2*b+1)+" "+(n*p));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
