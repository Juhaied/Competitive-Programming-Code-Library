import java.io.*;
import java.util.*;

public class Div3_891_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char ch[] = (0+in.next()).toCharArray();
            int pos = ch.length;

            for (int i = pos-1;i>0;i--){
                if(ch[i]>'4'){
                    pos = i;
                    ch[i-1]++;
                }
            }

            if(ch[0]!='0'){
                pw.print(ch[0]);
            }
            for (int i = 1;i<pos;i++){
                pw.print(ch[i]);
            }
            for (int i = pos;i<ch.length;i++){
                pw.print('0');
            }

            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
