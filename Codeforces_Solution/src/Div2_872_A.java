import java.io.*;
import java.util.*;

public class Div2_872_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
           String s = in.next();

           StringBuilder sb = new StringBuilder(s);

           HashSet<Character> set = new HashSet<>();

           for(int i = 0;i<s.length();i++){
               set.add(s.charAt(i));
           }

           if(set.size()==1){
               pw.println(-1);
           }
           else {
               pw.println(s.length()-1);
           }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
