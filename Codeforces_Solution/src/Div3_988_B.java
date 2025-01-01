import java.io.*;
import java.util.*;

public class Div3_988_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            Map<Integer,Integer> map = new HashMap<>();

            for (int i = 0;i<n;i++){
                map.put(in.nextInt(), 1);
            }

            int sub = n-2;
            int n1 = 0, m1 = 0;
            for(int i = 1;i<=n;i++){
                if(sub % i == 0 && map.containsKey( sub/i) && map.containsKey(i)){
                    n1 = i;
                    m1 = sub/i;
                    break;
                }
            }

            pw.println(n1+" "+m1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
