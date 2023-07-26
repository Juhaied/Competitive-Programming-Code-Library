import java.io.*;
import java.util.*;

public class Div3_888_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2= new ArrayList<>();

            for (int i = 0;i<n;i++){
                int v = in.nextInt();
                l1.add(v);
                l2.add(v);
            }
            boolean flaf = true;
            Collections.sort(l2);

            for (int i = 0;i<n;i++){
                if(l1.get(i) % 2!= l2.get(i)%2){
                    flaf = false;
                    break;
                }
            }

            if(flaf){
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
