import java.io.*;
import java.util.*;

public class Atcoder_291B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i =1;i<=5*n;i++){
            l.add(in.nextInt());
        }

        Collections.sort(l);

        int cc = n;
        for(int i = 0;i<cc;i++){
            l.remove(0);
        }
        for(int i = 0;i<cc;i++){
            l.remove(l.size()-1);
        }


        double s = 0;
        for(int i = 0;i<l.size();i++){
            s+=l.get(i);
        }

        pw.println(s/l.size());


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
