import java.io.*;
import java.util.*;

public class Div2_KingEscape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int x1 = in.nextInt(),y1 = in.nextInt();
        int x2 = in.nextInt(),y2 = in.nextInt();
        int x3 = in.nextInt(), y3 = in.nextInt();

        if((x1>x2 && x1<x3)|| (x1>x3 && (x1<x2)) || (y1>y2 && y1<y3)||(y1>y3&&y1<y2)){
            pw.println("NO");
        }
        else {
            pw.println("YES");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
