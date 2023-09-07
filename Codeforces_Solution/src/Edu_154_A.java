import java.io.*;
import java.util.*;

public class Edu_154_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();
            int two = 0,three = 0;

            for (int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    two = i;
                }
                else if(s.charAt(i)=='3'){
                    three = i;
                }
            }

            if(two>three){
                pw.println(31);
            }
            else {
                pw.println(13);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
