import java.io.*;
import java.util.*;

public class Div2_268_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int  p = in.nextInt();
        for(int i = 0;i<p;i++){
            set.add(in.nextInt());
        }
        int q = in.nextInt();

        for (int i = 0;i<q;i++){
            set.add(in.nextInt());
        }

        boolean flag = true;

        for(int i = 1;i<=n;i++){
            if(!set.contains(i)){
                flag = false;
                break;
            }
        }

        if(flag){
            pw.println("I become the guy.");
        }
        else {
            pw.println("Oh, my keyboard!");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
