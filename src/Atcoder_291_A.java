import java.io.*;
import java.util.*;

public class Atcoder_291_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = in.next();
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans=i+1;
                break;
            }
        }

        pw.println(ans);


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
