import java.io.*;
import java.util.*;

public class Div2_936_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0;i<n;i++){
                list.add(in.nextInt());
            }

            Collections.sort(list);

            int value = (list.size()+1)/2;
            //debug(value);

            int mid =  list.get(value-1);
            //  debug(mid);
            int last_index = list.lastIndexOf(mid);
            //  debug(last_index+" "+mid);

            if(n==1){
                pw.println(1);
            }
            else {
                pw.println((last_index-value)+2);
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
