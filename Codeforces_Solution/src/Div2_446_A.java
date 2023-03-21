import java.io.*;
import java.util.*;

public class Div2_446_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        long sum = 0;

        for(int i = 0;i<n;i++){
            sum+=in.nextInt();
        }

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0;i<n;i++){
            l.add(in.nextInt());
        }

        Collections.sort(l);

        long v = l.get(n-1)+l.get(n-2);

        if(v>=sum){
            pw.println("YES");
        }
        else {
            pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
