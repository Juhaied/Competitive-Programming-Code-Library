import java.io.*;
import java.util.*;

public class Div2_525_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n  = in.nextInt(), k = in.nextInt();
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0;i<n;i++){
            int v = in.nextInt();
            set.add(v);
            min = Math.min(min,v);
        }
        l = new ArrayList<>(set);
        pw.println(min);
        k--;
        Collections.sort(l);
        for (int i = 0;i<l.size()-1;i++){
            if(k==0){
                break;
            }
            else {
                pw.println((l.get(i+1)-l.get(i)));
                k--;
            }
        }
        while (k-->0){
            pw.println(0);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
