import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Div2_260_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        BigInteger b  =in.nextBigInteger();

        if(b.remainder(BigInteger.valueOf(4)).equals(BigInteger.ZERO)){
            pw.println(4);
        }
        else {
            pw.println(0);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
