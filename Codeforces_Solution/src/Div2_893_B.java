import java.io.*;
import java.util.*;

public class Div2_893_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            Map<Integer,Integer> map = new LinkedHashMap<>();
            int n = in.nextInt();
            for (int i = 1;i<=n;i++){
                int val = i;
                while (val<=n){
                    if(!map.containsKey(val)){
                        map.put(val,1);
                    }
                    val*=2;

                    //debug(map);
                }
            }

            for (int I : map.keySet()){
                pw.print(I+" ");
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
