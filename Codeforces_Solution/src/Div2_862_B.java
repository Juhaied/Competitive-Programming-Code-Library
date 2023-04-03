import java.io.*;
import java.util.*;

public class Div2_862_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            char characters [] = s.toCharArray();
            char ch[] = {'a','b','c','d','e',
                    'f','g','h','i',
                    'j','k','l','m','n',
                    'o','p','q','r','s',
                    't','u','v','w','x',
                    'y','z'};

            char c = characters[0];

            int hell = 0;
            for(int i = 0;i<26;i++){
                char idx = ch[i];
                String str = ""+idx;
                if(s.contains(str)){
                    if(c>=idx){
                        hell = s.lastIndexOf(idx);
                        break;
                    }
                }
            }

            pw.print(s.charAt(hell));

            for(int i = 0;i<s.length();i++){
                if(i==hell){
                    continue;
                }
                else {
                    pw.print(s.charAt(i));
                }
            }
            pw.println();
        }
        //pw.println();
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
