import java.io.*;
import java.util.*;

public class Div3_988_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            Map<Integer,Integer> map  =  new HashMap<>();

            for (int i = 0;i<n;i++){
                int val = in.nextInt();

                if(!map.containsKey(val)){
                    map.put(val,1);
                }
                else {
                    map.put(val,map.get(val)+1);
                }
            }

            int ans  = 0;

            for (Integer i : map.values()){
                 ans += i/2;
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
