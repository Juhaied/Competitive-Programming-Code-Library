import java.io.*;
import java.util.*;

public class Div2_436_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        String s = in.next();
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0;i<n;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                max = Math.max(max,set.size());
                set.clear();
            }
            else {
                set.add(s.charAt(i));
            }
        }
        max = Math.max(max,set.size());
        pw.println(max);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
