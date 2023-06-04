import java.io.*;
import java.util.*;

public class Div2_192_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0;i<m;i++){
            set.add(in.nextInt());
            set.add(in.nextInt());
        }
        int star =0;

        for (int i = 1;i<=n;i++){
            if(!set.contains(i)){
                star  = i;
                break;
            }
        }

        pw.println(n-1);

        for (int i = 1;i<=(n);i++){
            if(i==star)continue;
            else pw.println(star+" "+i);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
