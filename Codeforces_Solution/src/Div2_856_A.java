import java.io.*;
import java.util.*;

public class Div2_856_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<String> list = new ArrayList<>();

            for(int i =1;i<=2*n- 2;i++){
                String s = in.next();

                if(s.length()==n-1){
                    list.add(s);
                }
            }

            String s1 = list.get(0);
            StringBuilder sb = new StringBuilder(s1);
            sb = sb.reverse();
            s1 = sb.toString();
            String s2 = list.get(1);

            if(s1.equals(s2)){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
