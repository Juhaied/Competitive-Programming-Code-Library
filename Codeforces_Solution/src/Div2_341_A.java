import java.io.*;
import java.util.*;

public class Div2_341_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long total_sum = 0;
        long even_sum = 0;
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
            long v  = in.nextLong();
            if(v%2!=0){
                list.add(v);
            }

            total_sum+=v;
        }
        if(total_sum%2==0){
            pw.println(total_sum);
        }
        else {
            if (list.size() % 2 == 1) {
                total_sum -= Collections.min(list);
            }
            pw.println(total_sum);
        }




        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
