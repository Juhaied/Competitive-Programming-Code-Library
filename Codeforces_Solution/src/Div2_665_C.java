import java.io.*;
import java.util.*;

public class Div2_665_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

            int n = in.nextInt();

            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();

            for (int i = 0;i<n;i++){
                int v = in.nextInt();
                l1.add(v);
                l2.add(v);
            }
            Collections.sort(l2);

            int min = Collections.min(l2);

            if(min==1){
                pw.println("YES");
            }
            else {
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    int v1 = l1.get(i),v2 = l2.get(i);
                    if ((v1 != v2) && (gcd(l1.get(i),min)!= min || gcd(l2.get(i),min)!=min)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;

        else
            return gcd(b,a%b);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
