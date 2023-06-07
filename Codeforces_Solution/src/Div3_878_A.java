import java.io.*;
import java.util.*;

public class Div3_878_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            boolean flag = true;

            String s = in.next()+"0";

            char ch = s.charAt(0);

            StringBuilder sb = new StringBuilder();
            sb.append(ch);
            for (int i = 1;i<s.length();i++){
                if(ch!=s.charAt(i)){
                    continue;
                }
                else{
                    i++;
                    sb.append(s.charAt(i));
                    ch =s.charAt(i);
                }
            }

            String ss = sb.toString();

            pw.println(ss.substring(0,ss.length()-1));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
