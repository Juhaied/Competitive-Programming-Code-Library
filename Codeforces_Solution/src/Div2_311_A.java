import java.io.*;
import java.util.*;

public class Div2_311_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int min1 = in.nextInt(),max1 = in.nextInt();
        int min2 = in.nextInt(),max2 = in.nextInt();
        int min3 = in.nextInt(),max3 = in.nextInt();

        int one_two = Math.min(max1+max2,n-min3);
        int three = n - one_two;

        int one = Math.min(max1,one_two-min2);
        int two = one_two-one;
        pw.println(one +" "+two+" "+three);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
