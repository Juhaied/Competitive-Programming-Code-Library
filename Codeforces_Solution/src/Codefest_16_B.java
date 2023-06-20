import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.util.*;

public class Codefest_16_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i<=10_000_000;i++){
            if(numTrail(i)==n){
                list.add(i);
            }
        }

        pw.println(list.size());

        for (int i = 0;i<list.size();i++){
            pw.print(list.get(i)+" ");
        }
        pw.close();
    }
    static int numTrail(int n) {
        int res = 0;
        for(int i = 5; n/i >= 1; i *= 5) {
            res += n/i;
        }
        return res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
