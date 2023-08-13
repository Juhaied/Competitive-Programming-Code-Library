import java.io.*;
import java.util.*;

public class Div2_892_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> max = new ArrayList<>();
            ArrayList<Integer> min = new ArrayList<>();
            for (int j = 0;j<n;j++){
                int m = in.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0;i<m;i++){
                    list.add(in.nextInt());
                }
                Collections.sort(list);
                min.add(list.get(0));
                max.add(list.get(1));
            }
            Collections.sort(max);
            Collections.sort(min);
            if(n==1){
                pw.println(min.get(0));
            }
            else {
                long sum = min.get(0);

                for (int i = 1;i<max.size();i++){
                    sum+=max.get(i);
                }

                pw.println(sum);
            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
