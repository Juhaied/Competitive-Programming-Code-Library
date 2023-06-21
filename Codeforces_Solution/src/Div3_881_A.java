import java.io.*;
import java.util.*;

public class Div3_881_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n =in.nextInt();
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0;i<n;i++){
                l.add(in.nextInt());
            }
            Collections.sort(l);

         //   debug(l);
            if(l.size()>=4) {
                int sum  = 0;
               for (int i = 0;i<n/2;i++){
                   sum+=Math.abs(l.get(i)-l.get(l.size()-i-1));
               }

               pw.println(sum);
            }
            else if(n==1){
                pw.println(0);
            }
            else if(n==2){
                pw.println(l.get(l.size()-1)-l.get(0));
            }
            else {
                int sum = l.get(l.size() - 1) - l.get(0);

                pw.println(sum);

            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
