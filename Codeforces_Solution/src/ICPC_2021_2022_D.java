import java.io.*;
import java.util.*;

public class ICPC_2021_2022_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String str=in.next();
            String p=in.next();
            StringBuilder sb= new StringBuilder();

            HashMap<Character,Integer> hs= new HashMap<>();
            for(int i=0; i<p.length(); i++) {
                hs.put(p.charAt(i), hs.getOrDefault(p.charAt(i),0)+1);
            }

            for(int i=str.length()-1; i>=0;i--) {
                char c=str.charAt(i);
                if(hs.containsKey(c)) {
                    sb.append(c);
                    if(hs.get(c)==1) {
                        hs.remove(c);
                    }else {
                        hs.put(c, hs.get(c)-1);
                    }
                }
            }
            sb.reverse();
            String rev=sb.toString();
            if(rev.equals(p)) {
                pw.println("YES");
            }else {
                pw.println("NO");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
